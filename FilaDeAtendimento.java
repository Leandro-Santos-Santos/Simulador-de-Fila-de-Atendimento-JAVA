//Exercício: Simulador de Fila de Atendimento
//Descrição:

//Você foi contratado para desenvolver um simulador simples de fila de atendimento em uma clínica. A fila de atendimento segue o conceito de FIFO, ou seja, o primeiro paciente que chega é o primeiro a ser atendido.

//Requisitos:

//Crie uma classe Paciente com os seguintes atributos:

//nome: o nome do paciente (String)
//idade: a idade do paciente (int)
//Crie uma classe FilaDeAtendimento que simule a fila de atendimento, utilizando uma fila (Queue) para armazenar os pacientes.

//Implemente os seguintes métodos na classe FilaDeAtendimento:

//adicionarPaciente(Paciente paciente): adiciona um paciente à fila de atendimento.
//atenderPaciente(): remove e retorna o próximo paciente a ser atendido. Se a fila estiver vazia, retorne uma mensagem informando que não há pacientes na fila.
//mostrarFila(): exibe o nome de todos os pacientes na fila, na ordem em que serão atendidos.
//No método principal (main), crie uma instância de FilaDeAtendimento e adicione alguns pacientes à fila. Em seguida, simule o atendimento dos pacientes, removendo-os da fila um por um, até que todos tenham sido atendidos.


import java.util.ArrayList;

public class Paciente {
    public String nome;
    public int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}


public class FilaDeAtendimento {
    private ArrayList<Paciente> fila = new ArrayList<>();

  
    public void adicionarPaciente(Paciente paciente) {
        fila.add(paciente);
    }

   
    public String atenderPaciente() {
        if (fila.isEmpty()) {
            return "Não há pacientes na fila.";
        }
        Paciente paciente = fila.remove(0);
        return "Paciente atendido: " + paciente.nome + ", Idade: " + paciente.idade;
    }

  
    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Pacientes na fila:");
            for (Paciente paciente : fila) {
                System.out.println("Nome: " + paciente.nome + ", Idade: " + paciente.idade);
            }
        }
    }

    public static void main(String[] args) {
        FilaDeAtendimento fila = new FilaDeAtendimento();


        fila.adicionarPaciente(new Paciente("João", 30));
        fila.adicionarPaciente(new Paciente("Maria", 25));
        fila.adicionarPaciente(new Paciente("Pedro", 40));


        fila.mostrarFila();

        System.out.println(fila.atenderPaciente());
        System.out.println(fila.atenderPaciente());
    }
}
