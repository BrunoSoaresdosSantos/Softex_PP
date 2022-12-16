const e = require('prompt-sync')();
class Editor{
    constructor(){
        this.observers =[];
    }

}

class TextEditor extends Editor{
    text=[]
    texto=""
    insertline(){
        while(this.texto != "EOF"){
            this.notify("open")
            console.log("digite o texto que gostaria de adicionar")
            this.texto = e()
            if(this.texto =="EOF"){
                break
            }
            console.log("Digite a linha que gostaria de adicionar")
            let linenumber = Number(e())
            this.text.splice(linenumber,0,this.texto)
            this.notify("save")
            console.log(this.text)

        }

}
    removeline(){
        this.notify("open")
        console.log("digite a linha que deseja excluir")
        let linenumber = Number(e())
        console.log("ate que linha gostaria de excluir")
        let linenumber2 = Number(e())
        this.text.splice(linenumber,linenumber2)
        this.notify("save")
        console.log(this.text)
    }
    subscribe(a){
        this.observers.push(a)   
    }
    unsubscript(a){
        this.observers = this.observers.filter(subscriber => subscriber !== a)
    }
    notify(data){
        this.observers.forEach(observer => observer(data))
    }
}

function observador1(data){
    const observer = data
    console.log(observer)
}
const t = new TextEditor()
t.subscribe(observador1)
t.insertline()
t.removeline()
