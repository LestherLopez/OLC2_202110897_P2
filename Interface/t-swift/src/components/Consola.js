import React from 'react';
import CodeMirror from '@uiw/react-codemirror';
import { okaidia, okaidiaInit } from '@uiw/codemirror-theme-okaidia';

function Consola(props) {
 
  return (
    <CodeMirror
    value={props.consola}
    height="200px"
    theme={okaidia}
  />
  );
}
export default Consola;