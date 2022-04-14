package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;

@Service
public class LicenseService {

    private final MessageSource messageSource;

    public LicenseService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public License getLicense(String licenseId, String organizationId) {

        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setProductName("O-Stock");
        license.setLicenseType("FULL");
        license.setDescription("Software product");

        return license;
    }

    public String createLicense(License license, Locale locale) {

        String responseMessage = "Response message is empty";

        if (license != null) {
            responseMessage = String.format(messageSource.getMessage("license.create.message", null, locale), license);
        }

        return responseMessage;
    }

    public String updateLicense(License license, String organizationId, Locale locale) {

        String responseMessage = "Response message is empty";

        if (license != null) {
            license.setOrganizationId(organizationId);

            if (locale == null) {
                responseMessage = String.format(messageSource.getMessage("license.update.message", null, null));
            } else {
                responseMessage = String.format(messageSource.getMessage("license.update.message", null, locale));
            }
        }

        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId, Locale locale) {

        String responseMessage = "Response message is empty";

        if (locale == null) {
            responseMessage = String.format(messageSource.getMessage("license.delete.message", null, null));
        } else {
            responseMessage = String.format(messageSource.getMessage("license.delete.message", null, locale));
        }

        return responseMessage;
    }
}
