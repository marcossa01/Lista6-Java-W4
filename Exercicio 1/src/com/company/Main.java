package com.company;

import com.company.domain.CLT;
import com.company.domain.Funcionario;
import com.company.domain.PJ;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*
    Pela escala hierárquica temos dois tipos de
    funcionários, CLT e PJ. Funcionários PJ são prestadores de serviços e recebem por
    hora trabalhada. Funcionários CLT recebem de acordo com o cargo que ocupam na
    empresa + Bônus e gratificações que são calculados em porcentagem do salário
    base. Em geral Funcionários CLT são divididos na seguinte hierarquia: Técnicos,
    analistas, gerentes e diretores
    a. Técnicos recebem bonificação de 5% por meta batida, trabalham uma jornada
    de 40h semanais e não têm descanso semanal remunerado. O salário base de
    um técnico é de R$ 3.200.
    b. Analistas possuem bonificação de 8% por meta batida, trabalham uma jornada
    de 40h horas semanais e possuem 4h de descanso semanal remunerado. O
    salário base de um analista é de R$ 4.000
    c. Gerentes possuem bonificação de 12,5% por meta batida, trabalham 36h
    semanais com 4h de descanso semanal remunerado. O salário base de um
    gerente é de R$ 6.000.

    d. Diretores não possuem bonificação, entretanto recebem participação nos
    lucros de 3%, não possuem horário de trabalho definido e seu salário base é
    de R$ 15.000.

            2. Você precisa implementar o método pagarSalario para cada categoria de forma a
    considerar as especificidades de cada uma.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        Integer matricula, horasTrabalhadas;
        char funcao, tipo;
        Double lucroEmpresa, metaBatida, valorHora;

        System.out.print("Tipo de funcipnário(C - CLT / P - PJ): ");
        tipo = sc.next().charAt(0);

        if(tipo == 'C') {
            System.out.print("Digite o nome do Funcionário: ");
            sc.nextLine();
            nome = sc.nextLine();

            System.out.print("Digite a matrícula do Funcionário: ");
            matricula = sc.nextInt();

            System.out.print("Digite a função do Funcionário (T - Técnicos / A - Analistas / G - Gerentes / D - Diretores): ");
            funcao = sc.next().charAt(0);

            if(funcao == 'D') {
                System.out.print("Digite o lucro mensal da Empresa: ");
                lucroEmpresa = sc.nextDouble();

                metaBatida = 0.0;
            }
            else {
                System.out.print("Digite a meta batida pelo Funcionário: ");
                metaBatida = sc.nextDouble();

                lucroEmpresa = 0.0;
            }
            Funcionario f1 = new CLT(nome, matricula, funcao, metaBatida , lucroEmpresa);
            f1.pagarSalario();
            System.out.println(f1);
        }

        else if (tipo == 'P') {
            System.out.print("Digite o nome da Empresa: ");
            sc.nextLine();
            nome = sc.nextLine();

            System.out.print("Digite a matrícula da Empresa: ");
            matricula = sc.nextInt();

            System.out.print("Digite o valor da hora trabalhada: ");
            valorHora = sc.nextDouble();

            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horasTrabalhadas = sc.nextInt();

            Funcionario f2 = new PJ(nome, matricula, valorHora, horasTrabalhadas);
            f2.pagarSalario();
            System.out.println(f2);
        }

        else {
            System.out.println("Opção incorreta!");
        }

        sc.close();

    }
}
