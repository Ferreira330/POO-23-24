public class Ficha1
{
    public void ex1(int dia, int mes, int ano)
    {
        int n_mes = 0;
        int n_ano = (ano -1900)*365;
        n_ano += (ano-1900)/4;
        if (ano % 4 == 0 && mes < 3)
        {
            n_ano--;
        }
        switch (mes) {
            case 1:
                n_ano += dia;
                break;
            case 2:
                n_ano += 31 + dia;
                break;
            case 3:
                n_ano += dia + 31 + 28;
                break;
            case 4:
                n_ano += dia + 31 + 28 + 31;
                break;
            case 5:
                n_ano += dia + 31 + 28 + 31 + 30;
                break;
            case 6:
                n_ano += dia + 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                n_ano += dia + 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8:
                n_ano += dia + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                n_ano += dia + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                n_ano += dia + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                n_ano += dia + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                n_ano += dia + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
            default:
                break;
        }
        n_ano += (ano/7);
        switch (n_ano) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                break;
        }

    }
    public static void ex2(int d1, int h1, int m1, int d2, int h2, int m2)
    {
        int soma = (d1*24*60) + (h1*60) + m1 + (d2*24*60) + (h2*60) + m2;
        int dias = soma/(24*60);
        int horas = (soma - (dias*24*60))/(60);
        int minutos = soma - (dias*24*60) - (horas*60);
        System.out.println("Dias: " + dias + " Horas: " + horas + " Minutos: " + minutos);
    }

    public static void main(String[] args) 
    {
        ex2(1, 2, 3, 4, 5, 4);
    }
}