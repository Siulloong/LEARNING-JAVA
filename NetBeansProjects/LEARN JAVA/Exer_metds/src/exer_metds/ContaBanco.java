package exer_metds;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Funções e procedimentos (metodos---------------------------------------
    public void estadoAtual() {
        System.out.println("--------------------------------");
        System.out.println("Numero da conta : "+this.getNumConta());
        System.out.println("Dono da Conta : "+this.getDono());
        System.out.println("Saldo : "+this.getSaldo());
       
        if(this.getStatus()) {
            String st = "Aberto";
            System.out.println("Status : "+st);
        }else{
            String st= "Fechado";
            System.out.println("Status : "+st);
        }
        
        System.out.println("_________________________________");
       }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        if (t=="CC") {
            this.setSaldo(50);
        } else if(t=="CP") {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo()>0) {
            System.out.println("Conta com dinheiro...");
        } else  if (this.getSaldo()<0) {
                    System.out.println("Conta com débito ...");
                } else {
                        System.out.println("Conta encerrada ...");
                        this.setStatus(false);
                }
       }
                
    public void depositar(float v) {

        if (this.getStatus()) {
            this.setSaldo(getSaldo()+v);
            System.out.println("Depositado com sucesso "+v+" na conta de "+this.getDono());
        } else {
            System.out.println("Conta fechada ...");
        }
    }
    
    public void sacar(float s) {
        if (this.getStatus()) {
            if (this.getSaldo()>=s){
                this.setSaldo(this.getSaldo()-s);
                System.out.println("Saque de "+s+" na conta de "+this.getDono());
            } else {
                System.out.println("Saldo insuficiente ...");
            }
        } else {
            System.out.println("Conta Encerrada");
        }
    }
    
    public void mensal() {
        float v;
        if(getTipo()=="CC"){
            v = 12;
        }else {
            v=20;
        }
        if(getStatus()){
            if(getSaldo()>=v){
                setSaldo(getSaldo()-v);
            } else {
                System.out.println("Saldo insuficiente...");
            }
        } else {
            System.out.println("Impossivel pagar...");
        }    
    }
    
    //metodos especiais-----------------------------------------
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
