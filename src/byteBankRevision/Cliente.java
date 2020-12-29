package byteBankRevision;

public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getCpf() {
		return cpf;
	}

	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}

	protected String getProfissao() {
		return profissao;
	}

	protected void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}