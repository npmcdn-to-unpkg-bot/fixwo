package fixwo

class Usuario {

    String nome
    String login
    String hashSenha
    String email
    int ativo=0;
    Grupo[] grupo

    static constraints = {
		nome (nullable:false, blank:false, unique:false)
		email(email:true, nullable:false, blank:false)
		login(nullable:false, blank:false, unique:true)
		hashSenha(nullable:false, blank:false, password:true)
		grupo(nullable:true, blank:true)
    }

}
