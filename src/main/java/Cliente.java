public class Cliente {

    private String cpf;
    private String estadoCheckIn;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCheckIn() {
        return estadoCheckIn;
    }

    public void fazerCheckIn() {
        this.estadoCheckIn = "Check-in concluido";
    }

    public void cancelarCheckIn() {
        this.estadoCheckIn = "Check-in em aberto";
    }
}
