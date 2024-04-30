package kr.co.codemind.ccms.configuration.security;

import kr.co.codemind.ccms.entity.Users;
import kr.co.codemind.ccms.exception.BusinessError;
import kr.co.codemind.ccms.exception.CcmsAuthenticationException;
import kr.co.codemind.ccms.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * 로그인 시 사용자 정보 검증
 */
@Component("ccmsAuthenticationProvider")
@RequiredArgsConstructor
public class CcmsAuthenticationProvider implements AuthenticationProvider {

	private final UsersRepository usersRepository;
	private final PasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String id = authentication.getName();
		String password = (String) authentication.getCredentials();

		// id 검증
		Users users = usersRepository.findById(id)
				.orElseThrow(() -> new CcmsAuthenticationException(BusinessError.USER_AUTH_FAILED));

		// 비밀번호 검증
		if (!passwordEncoder.matches(password, users.getPassword())) {
			throw new CcmsAuthenticationException(BusinessError.USER_AUTH_FAILED);
		}
		// 이 객체가 스프링 시큐리티 컨텍스트에 등록됨
		return new CcmsAuthentication(users);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
