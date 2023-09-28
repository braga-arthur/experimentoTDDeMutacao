import org.example.Livro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @BeforeEach
    void setUp() {
        String autor = "Giuliano";
        String titulo = "Giuliano";
        int anoPublicacao = 2016;
        boolean disponivel = true;
        Livro livro = new Livro(titulo, autor, anoPublicacao, disponivel);
    }


    @Test
    void getTitulo() {
        String autor = "Giuliano";
        String titulo = "Giuliano";
        int anoPublicacao = 2016;
        boolean disponivel = true;
        Livro livro = new Livro(titulo, autor, anoPublicacao, disponivel);

        assertEquals(livro.getTitulo(), "Giuliano");
    }

    @Test
    void setTitulo() {
        setTitulo();
    }

    @Test
    void getAutor() {
        getAutor();
    }

    @Test
    void setAutor() {
        setAutor();
    }

    @Test
    void getAnoPublicacao() {
        getAnoPublicacao();
    }

    @Test
    void setAnoPublicacao() {
        setAnoPublicacao();
    }

    @Test
    void isDisponivel() {
        isDisponivel();
    }

    @Test
    void setDisponivel() {
        setDisponivel();
    }
}