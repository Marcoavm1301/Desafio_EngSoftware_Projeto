public class Data {
    private int dia;
    private int mes;
    private int ano;

public Data(int dia, int mes, int ano){     
            this.dia = dia;
                this.mes = mes;
                this.ano = ano;

   if (dia!=29 && mes!=2 &&  mes <= 12 && dia>0 && mes>0 && dia<32) {
                if ((mes==4 || mes==6 || mes==9 || mes==11) && dia<=30){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
         } else if ((mes!=4 && mes!=6 && mes!=9 && mes!=11) && dia<=31 && mes<13){
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
        }    
            else {
                 System.out.println("Erro");
                 this.dia = 1;
                 this.mes = 1;
                 this.ano = 2000;
        }
     if (dia>28 && mes==2) {  
        if(verificaAnoBissexto()==false || dia > 29){
            System.out.println("Erro");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

         }}        
    
    }



    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String toString() {
        return "Data: "+dia+"/"+mes+"/"+ano;
    }
    public boolean verificaAnoBissexto(){
        if (this.ano%4==0 && this.ano%100!=0 && this.ano%400!=0) {
            return true;
        }
        else {
            return false;
        }
    }
}