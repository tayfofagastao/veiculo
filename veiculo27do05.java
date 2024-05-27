package prova;

public class veiculo27do05 {

    public String marca;
    public String modelo;
    public int combustivel;
    public double tanque;
    public int autonomia;

    public double calcularConsumo(int distancia) {
        if (combustivel == 1) {

            return (double) distancia / autonomia;
        } else {

            return (double) distancia / autonomia;
        }
    }

    public static void main(String[] args) {

        veiculo27do05 ferrari = new veiculo27do05();
        ferrari.marca = "Ferrari";
        ferrari.modelo = "296 GTS";
        ferrari.combustivel = 1;
        ferrari.tanque = 65.0;
        ferrari.autonomia = 135;

        veiculo27do05 popular = new veiculo27do05();
        popular.marca = "Volkswagen";
        popular.modelo = "Gol";
        popular.combustivel = 0;
        popular.tanque = 55.0;
        popular.autonomia = 12;

        veiculo27do05 miniVan = new veiculo27do05();
        miniVan.marca = "Toyota";
        miniVan.modelo = "Sienna";
        miniVan.combustivel = 0;
        miniVan.tanque = 75.0;
        miniVan.autonomia = 10;

        int distanciaViagem = 300;

        System.out.println("Consumo da viagem para a Ferrari: " + ferrari.calcularConsumo(distanciaViagem) + " cargas");
        System.out.println("Consumo da viagem para o Carro Popular: " + popular.calcularConsumo(distanciaViagem) + " litros");
        System.out.println("Consumo da viagem para a Mini Van: " + miniVan.calcularConsumo(distanciaViagem) + " litros");
    }
}


