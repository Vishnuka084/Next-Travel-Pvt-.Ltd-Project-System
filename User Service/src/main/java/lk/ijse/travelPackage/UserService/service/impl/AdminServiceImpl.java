package lk.ijse.travelPackage.UserService.service.impl;

import lk.ijse.travelPackage.UserService.entity.Admin;
import lk.ijse.travelPackage.UserService.entity.User;
import lk.ijse.travelPackage.UserService.repository.AdminRepository;
import lk.ijse.travelPackage.UserService.repository.UserRepository;
import lk.ijse.travelPackage.UserService.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 10/17/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public void loginAdminFind(String email, String password) {
        if (adminRepository.existsByLoginEmail(email)) {
            Admin byLoginEmail = adminRepository.getByLoginEmail(email);
            if (!byLoginEmail.getLoginPassword().equals(password))
                throw new RuntimeException("Wrong Password!");
        } else {
            throw new RuntimeException("Wrong Email Address!");
        }
    }
}
