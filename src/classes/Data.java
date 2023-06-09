package classes;
public class Data {
    int dia;
    int mes;
    int ano;
    
    public Data(int dia, int mes, int ano) {
        int[] mesesCom31Dias = {1, 3, 5, 7, 8, 10, 12};
        int[] mesesCom30Dias = {4, 6, 9, 11};

        if(dia >= 1 && dia <= 31) {
            if(mes >= 1 && mes <= 12) {
                if(mes == 2) {
                    if(!(ano % 4 == 0) && dia > 28) {
                        this.DataInvalida();
                    } else if(dia <= 29) {
                        this.DataValida(dia, mes, ano);
                    }
                } else {
                    for(int i = 0; i < mesesCom31Dias.length; i++) {
                        if(mesesCom31Dias[i] == mes) {this.DataValida(dia, mes, ano);}
                    }
                    for(int i = 0; i < mesesCom30Dias.length; i++) {
                        if(mesesCom30Dias[i] == mes && dia >= 30) {this.DataValida(dia, mes, ano);}
                    }
                }
            } else {
                this.DataInvalida();
            }
        } else {
           this.DataInvalida();
        }

        this.DataValida(dia, mes, ano);
    }; 

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return  this.dia + "/" + this.mes + "/" + this.ano;
    };

    public boolean verificaAnoBissexto() {
        if(this.ano % 4 == 0) return true;
        else return false;
    }

    private void DataValida(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    private void DataInvalida() {
        System.out.println("Erro! Data invalida.");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }
};





