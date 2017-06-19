- To create jks file

```bash
keytool -genkeypair -alias nutshell -keyalg RSA
```

- To create certification file
```bash
keytool -export -keystore key.jks -alias nutshell -file key.cer
```

-  To print public key
```bash
openssl x509 -inform der -in key.cer -pubkey -noout
```