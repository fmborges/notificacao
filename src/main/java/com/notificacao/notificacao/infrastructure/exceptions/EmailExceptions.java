package com.notificacao.notificacao.infrastructure.exceptions;

import com.notificacao.notificacao.business.EmailService;

public class EmailExceptions extends RuntimeException{

    public EmailExceptions(String mensagem){
        super(mensagem);
    }
    public EmailExceptions(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }


}
