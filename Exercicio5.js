const e = require('prompt-sync')();
class Strategy{
    execute(){

    }
}
class Somar extends Strategy{
    execute(n1,n2) {
        var resul = Number
        resul = n1+n2
        console.log("a soma é: "+resul)
    }
}
class Mutiplicar extends Strategy{
    execute(n1,n2) {
        console.log("a mutiplicação é: "+n1*n2)
        
    }
}
class Subtrair extends Strategy{
    execute(n1,n2) {
        var resul = Number
        resul = n1-n2
        console.log("a subtração é: "+ resul)
    }
}
class calcular{
    calcula =""
    setStrategy = (calcula)=>{
        this.calcula = calcula
    }
    execute(){
        return this.calcula.execute(n1,n2)
    }

}

var n1 = Number(e("Digite um número: "))
var n2 = Number(e("Digite outro número: "))
console.log("digite [-] para subtração\n[+] para soma\n[*] para mutiplicação: ")
var op = e()

const so = new Somar()
const su = new Subtrair()
const mut = new Mutiplicar()
const ca = new calcular()
valor ={
    "+":so,
    "-":su,
    "*":mut
}
ca.setStrategy(valor[op])
ca.execute()


