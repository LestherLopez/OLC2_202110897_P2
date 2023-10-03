import React, { useState, useRef } from "react";
import { Col, Container, Row } from "react-bootstrap";
import Button from 'react-bootstrap/Button';
import Editor from "../components/Editor";
import Consola from "../components/Consola";
import axios from "axios";
import Form from 'react-bootstrap/Form';

function Home(){
    const [editor, setEditor] = useState("");
    const [consola, setConsola] = useState("");
    const [code, setCode] = useState('print("hello world!")');
     //estados de modal para ast
     const [show, setShow] = useState(false);
     const handleClose = () => setShow(false);
     const handleShow = () => setShow(true);
     //estados de modal para tabla de simbolos
     const estiloOscuro = {
        backgroundColor: 'black', // Fondo oscuro
        color: 'white', // Texto en blanco
        border: '1px solid white', // Borde blanco
        borderRadius: '0.25rem',
        padding: '0.375rem 0.75rem',
      };
      const estiloBoton = {
        backgroundColor: '#28a745', // Azul vibrante
        color: 'white', // Texto en blanco
        border: 'none', // Sin borde
        borderRadius: '0.25rem',
        padding: '0.375rem 0.75rem',
        cursor: 'pointer',
        transition: 'background-color 0.2s, color 0.2s, box-shadow 0.2s',
        boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)', // Sombra al pasar el cursor
      };
     const [shows, setShows] = useState(false);
     const handleCloses = () => setShows(false);
     const handleShows = () => setShows(true);
     //estados de modal para tabla de errores
     const [showe, setShowe] = useState(false);
     const handleClosee = () => setShowe(false);
     const handleShowe = () => setShowe(true);
     const fileInputRef = useRef(null);

        const handleButtonClick = () => {
            fileInputRef.current.click();
        };


     const handleFileChange = (event) => {
     const files = event.target.files;
     const reader = new FileReader();
     reader.onload = (e) => {
       setEditor(e.target.result);
       setCode(e.target.result)
     };
     reader.readAsText(files[0]);
   };
 
    const interpretar = async () => {
        console.log("ejecutando")
        try {
            setConsola("ejecutando...");
            if(editor ==""){
                setConsola("No hay codigo para interpretar");
                console.log("No hay codigo para interpretar");
            }else {
                console.log(editor)
                const response = await axios.post('http://localhost:5000/interpreter', {code:editor});
                
                const {consola,errores} = response.data;   
                console.log(consola);
                setConsola(response.data);
            }
        } catch (error) {
            console.log(error);
            setConsola("Error en el servidor");
        }
    };


   
    return (
        <Container>
            <Row>
                <Col>
                    <h1 className="text-white">Editor</h1>
                </Col>
                <Col>
                    <h1 className="text-white">Consola</h1>
                </Col>

            </Row>
            <Row>
                <Col style={{ textAlign: 'left' }}>
                    <Editor input={setEditor} value={code}/>
                </Col>
                
                <Col style={{ textAlign: 'left' }}>
                    <Consola consola={consola}/>
                </Col>
              
            </Row>
            {/*seccion de botones */}
            
            {/*seccion de botones */}
            <Row>
                    <Col>
                        <Button style={estiloBoton} variant="outline-secondary" onClick={() =>interpretar()} >Run</Button>{' '}
                        <Button variant="primary" onClick={handleShow}>
                                                                        Reporte AST
                                                                    </Button>{' '}
                        <Button variant="primary" onClick={handleShows}>Reporte Tabla de Simbolos</Button>{' '}               
                        <Button variant="primary" onClick={handleShowe}>Reporte Tabla de Errores</Button>{' '}     
                        <input
                        type="file"
                        ref={fileInputRef}
                        style={{ display: 'none' }}
                        onChange={handleFileChange}
                         />
                        <Button onClick={handleButtonClick}>Cargar Archivo</Button>          
                    </Col>
                </Row>
            
        </Container>
    );
}

export default Home;