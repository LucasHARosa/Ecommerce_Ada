package tech.ada.ecommerce.model.enums;

public enum StatusEnum {

    EM_ABERTO("Em aberto"),
    PGTO_APROVADO("Pagamento aprovado"),
    PGTO_PROCESSAMENTO("Pagamento em processamento"),
    PGTO_REJEITADO("Pagamento rejeitado"),
    CANCELADO("Cancelado"),
    EM_TRANSPORTE("Em transporte"),
    ENTREGUE("Entregue");

    public String status;

    StatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
