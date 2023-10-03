package environment

import "fmt"

type SwitchVar struct {
	SwitchVar map[string]Symbol
}

func (env Environment) KeepVariableSwitch(id string, value Symbol) {

	env.Variables[id] = value

}
func (env Environment) GetVariableSwitch(id string) Symbol {

	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Variables[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe en este environment")
	return Symbol{Lin: 0, Col: 0, Id: "", Tipo: NULL, Valor: 0, Mutable: false}
}
