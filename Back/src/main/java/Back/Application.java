package Back;

import Back.atendimento.model.AtendimentoStatus;
import Back.atendimento.model.AtendimentoTipo;
import Back.atendimento.model.entity.AtendimentoEntity;
import Back.cadastro.model.entity.cadastro.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

/*
		Cadastro cadastro = new Cadastro();
		cadastro.setId(1);
		cadastro.setNome("João");
		Perfil perfil = new Perfil();
		perfil.setCliente(true);

		cadastro.setPerfil(perfil);

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua tarara");
		endereco.setNumero("123");

		cadastro.setEndereco(endereco);

		System.out.println(cadastro.getNome());
		System.out.println(cadastro.getEndereco().getLogradouro() + "," +cadastro.getEndereco());

		System.out.println(cadastro);

		cadastro.setEndereco(endereco);


		AnimalEntity animal = new AnimalEntity();
		animal.setId(1);
		animal.setNome("DOG");
		animal.setAniversario(LocalDate.of(2025,12,12));
		animal.setEspecie(AnimalEspecie.CACHORRO);

		ProdutoServico servico = new ProdutoServico();
		servico.setId(1);
		servico.setServico(true);
		servico.setNome("Banho");
		servico.setValor(50.0);

		AtendimentoEntity atendimento = new AtendimentoEntity();
		atendimento.setId(1);
		atendimento.setDate(LocalDate.now());
		atendimento.setHora(LocalTime.now());
		atendimento.setDescricao(servico.getNome());
		atendimento.setValor(servico.getValor());
		atendimento.setStatus(AtendimentoStatus.REALIZADO);
		atendimento.setTipo(AtendimentoTipo.HIGIENIZACAO);
		atendimento.setAnimal(animal.getId());
		atendimento.setProdutoServico(servico.getId());
		atendimento.setCadastros(cadastro.getId());



		System.out.println(atendimento);
*/

	}



}
