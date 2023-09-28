package org.example;

import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Reserva reserva;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo (Livro livro, Usuario usuario, Reserva reserva, Date dataEmprestimo, Date dataDevolucao){
        setLivro(livro);
        setUsuario(usuario);
        setReserva(reserva);
        setDataEmprestimo(dataDevolucao);
        setDataDevolucao(dataEmprestimo);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
