package com.wanderoliveira.minhasfinancas.service.impl;

import com.wanderoliveira.minhasfinancas.exception.RegraNecocioException;
import com.wanderoliveira.minhasfinancas.model.entity.Usuario;
import com.wanderoliveira.minhasfinancas.model.repository.UsuarioRepository;
import com.wanderoliveira.minhasfinancas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;
	

	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNecocioException("Já existe um usuário cadastrado com este email.");
		
		}
		
	}

}
