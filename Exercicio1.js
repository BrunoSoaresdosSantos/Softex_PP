const e = require("prompt-sync")();

class Fabrica{
    constructor(pc,server){
        this.pc = pc
        this.server = server
    }
    interface(){
        console.log("Digite [1] para server e [2] para pc: ")
    }

    setserver(ram, hdd, cpu, type){
        this.server = [ram, hdd, cpu, type]
        
    }
    setpc(ram, hdd, cpu, type){
        this.pc=[ram, hdd, cpu, type]
        
    }
    getserver(){
        return this.server
    }
    getpc(){
        return this.pc
    }
}
const s = new Fabrica("server","pc")
var tipo = Number(e(s.interface()))
if(tipo==1){
    const s = new Fabrica('','server')
    var r = String(e("Digite a ram em GB: "))
    var h = String(e("Digite o hdd em GB: "))
    var c = String(e("digite a cpu em GHz: "))
    s.setserver(r+"GB",h+"GB",c+"GHz","server")
    console.log(s.getserver().toString())
} else if(tipo==2){
    const s = new Fabrica('pc','')
    var r = String(e("Digite a ram em GB: "))
    var h = String(e("Digite o hdd em GB: "))
    var c = String(e("digite a cpu em GHz: "))
    s.setserver(r+"GB",h+"GB",c+"GHz","pc")
    console.log(s.getserver().toString())
}