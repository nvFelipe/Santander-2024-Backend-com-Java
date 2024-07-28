package dio.domain.service;

import dio.domain.model.User;
import dio.domain.model.repository.UserRepository;

public class UserServiceimpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) throws NoSuchFieldException {
        return userRepository.findById(id).orElseThrow(NoSuchFieldException::new);
    }

    @Override
    public User create(User userToCreate) throws IllegalAccessException {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId()))
            throw new IllegalAccessException("This user Id already exist.");
        return null;
    }

    }

