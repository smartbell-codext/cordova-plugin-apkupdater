package de.kolbasa.apkupdater.downloader.exceptions;

public class InstallationFailedException extends Exception {
    public InstallationFailedException(String errorMessage) {
        super(errorMessage);
    }
}