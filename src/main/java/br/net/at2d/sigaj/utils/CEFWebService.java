package br.net.at2d.sigaj.utils;

import java.security.MessageDigest;
import java.util.Base64;

public class CEFWebService {
  public String DO_HASHB64(String DADOS) {
    MessageDigest MD;
    byte[] HASH;
    try {
      MD = MessageDigest.getInstance("SHA-256");
      HASH = MD.digest(DADOS.getBytes("ISO8859-1"));

      return Base64.getEncoder().encodeToString((HASH));
    } catch (Exception EX) {
      return null;
    }
  }
}
