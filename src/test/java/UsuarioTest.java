import org.example.Livro;
import org.example.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    private Usuario usuario;
    private Livro livro1;
    private Livro livro2;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Nome do Usuário", 123456789);
        livro1 = new Livro("Livro 1", "Autor 1", 2020, true);
        livro2 = new Livro("Livro 2", "Autor 2", 2021, true);
    }

    @Test
    public void testAdicionarLivroEmprestado() {
        usuario.adicionarLivroEmprestado(livro1);
        usuario.adicionarLivroEmprestado(livro2);

        List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
        assertTrue(livrosEmprestados.contains(livro1));
        assertTrue(livrosEmprestados.contains(livro2));
    }

    @Test
    public void testRemoverLivroEmprestado() {
        usuario.adicionarLivroEmprestado(livro1);
        usuario.adicionarLivroEmprestado(livro2);

        usuario.removerLivroEmprestado(livro1);

        List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
        assertFalse(livrosEmprestados.contains(livro1));
        assertTrue(livrosEmprestados.contains(livro2));
        assertEquals(1, livrosEmprestados.size());
    }
}
