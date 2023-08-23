package API.Rest.medico;

import API.Rest.endereco.DadosEndereco;

//record classe mutavel
public record DadosCadastroMedico
        (String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
