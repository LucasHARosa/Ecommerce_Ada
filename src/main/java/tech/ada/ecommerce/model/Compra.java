package tech.ada.ecommerce.model;

import jakarta.persistence.*;
import tech.ada.ecommerce.model.enums.StatusEnum;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    private Date dataCompra;
    private double valorProdutos;
    private double valorTotal;
    private double valorFrete;
    private double  desconto;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "compra")
    private List<ItemProduto> itens;

    @Enumerated(value = EnumType.STRING)
    private StatusEnum status;

    public Compra() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(double valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public List<ItemProduto> getItens() {
        return itens;
    }

    public void setItens(List<ItemProduto> itens) {
        this.itens = itens;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compra compra)) return false;
        return Objects.equals(getId(), compra.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
