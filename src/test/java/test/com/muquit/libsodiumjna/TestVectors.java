package test.com.muquit.libsodiumjna;

/**
 * Test Vectors for libsodium using v1.0.15
 * Auto Generated by gen_test_vectors for libsodium-jna
 * By muquit@muquit.com
 */

public class TestVectors
{
    public static final String PASSWORD_STR = "Correct Horse Battery Staple";
    public static final String MESSAGE_STR = "this is a test";
    public static final byte[] MESSAGE = MESSAGE_STR.getBytes();
    public static final byte[] PASSWORD = PASSWORD_STR.getBytes();

// Password hashing Argon2
    public static final String PWHASH_ARGON2_SALT="991bce125b5a8b8e2e2f1bfc56fe0c22";
    public static final int    PWHASH_ARGON2_SALT_LEN=16;
    public static final String PWHASH_ARGON2_KEY="5ebe6252ce0687f06c1ef86861d35a17004072adc7106328ab081332713f9671";
    public static final int    PWHASH_ARGON2_KEY_LEN=32;
    public static final String SECRET_BOX_SALT="991bce125b5a8b8e2e2f1bfc56fe0c22";

// Password storage
   public static final String PWHASH_ARGON2_HASHED_PASSWORD="$argon2id$v=19$m=65536,t=2,p=1$zENkX8YNYquKv6ROc3F0YQ$qDv6vbD2TMlYKeLnOjPCJoG7hTrAnS1NiaMBEW4F980";

// Password hashing scrypt
    public static final String PWHASH_SCRYPT_SALT="5d05e60191d4717bf7b260cabc4a96cfc1e9a797937c9f18ee8ac870597ef43b";
    public static final int    PWHASH_SCRYPT_SALT_LEN=32;
    public static final String PWHASH_SCRYPT_KEY="70977912b6896921f1cdb41f26aac07179295370f8921b50f06a63bb3ba1ec04";
    public static final int    PWHASH_SCRYPT_KEY_LN=32;

// Secret-key authenticated encryption
    public static final String SECRET_BOX_NONCE="aad1388c5be57294349a64f61a7f10437f456598a50c1075";
    public static final int    SECRET_BOX_NONCE_LEN=24;
    public static final String SECRET_BOX_KEY="2c992da083eebccec872849e12034ce68dbfb887f56aa9b0388825aa819621d5";
    public static final int    SECRET_BOX_KEY_LEN=32;
    public static final String SECRET_BOX_CIPTHER_TEXT="c9c148316877d3e18cc6ba5a659dbd2e89a8fe4787ad16fd3bb10fd48f68";
    public static final int    SECRET_BOX_CIPTHER_TEXT_LEN=30;
     public static final String SECRET_BOX_DETACHED_MAC="c9c148316877d3e18cc6ba5a659dbd2e";
     public static final String SECRET_BOX_DETACHED_CIPHER_TEXT="89a8fe4787ad16fd3bb10fd48f68";
     public static final int    SECRET_BOX_DETACHED_CIPHER_TEXT_LEN=14;
     public static final int    SECRET_BOX_DETACHED_MESSAGE_LEN=14;

// Secret-key authentication verification
   public static final String SECRET_KEY_AUTH_KEY="5813d5126014894182898073c2310b8ed92dc5a8912426506fb23369ae3e9910";
   public static final String SECRET_KEY_AUTH_MAC="1d76bc8c71ef6d923b4c7cf226a1ebeccb013e36ed0ee32ac202225368afbdd0";

// Public-key authenticated encryption
    public static final String CRYPTO_BOX_NONCE="d92dc5a8912426506fb23369ae3e99107f456598a50c1075";
    public static final int    CRYPTO_BOX_NONCE_LEN=24;
    public static final String CRYPTO_BOX_BOB_PUBLIC_KEY="f81302d2a2ab3394d53754956902b03fa15ef5968b5f56f36922f33b8496982d";
    public static final String CRYPTO_BOX_BOB_PRIVATE_KEY="a2ac413b570a5da6e1be7da80eea2b84b9b203ce9a823da6c468636215eb729b";
    public static final String CRYPTO_BOX_ALICE_PUBLIC_KEY="d59202c3d56a14b5377b95d8a85c64196e4c02a29fa3c07119609c5eca5a4021";
    public static final String CRYPTO_BOX_ALICE_PRIVATE_KEY="adce8b5c3198cc55729969b7481661bf0f9d9c2f4c6c4de9da71f8b3dd9c085d";
    public static final int    CRYPTO_BOX_KEY_LEN=32;
    // Alice Encrypts with Bob's Public Key
    public static final String CRYPTO_BOX_ALICE_CIPHERTEXT="3049e82a25170af1f303f4c0db21b070acb9540984a5caf2f27ff86c3129";
    // Bob decrypt's with his private Key
    public static final String CRYPTO_BOX_BOB_PLAINTEXT="7468697320697320612074657374";
    public static final int    CRYPTO_BOX_CIPHERTEXT_LEN=30;

// Public-key authenticated encryption
    public static final String SEALBOX_RECIPIENT_PUBLIC_KEY="096b323962cc65f7c59ba3d8679db9177f0c5931afb9084707c992e9b1d4a608";
    public static final String SEALBOX_RECIPIENT_PRIVATE_KEY="c5b1c51e7701db954eb026e4618175bfb35e70ce1f87fd2355a9d00c81ec81d2";
    public static final int    SEALBOX_RECIPIENT_PUBLIC_KEY_LEN=32;
    public static final int    SEALBOX_RECIPIENT_PRIVATE_KEY_LEN=32;
    public static final String SEALBOX_CIPHERTEXT="d0b4de90dba2ba004414872118c501078b021e129f6176031b47b0e9befee9665f3a22a624e57f60efffffcd0f667beced41352a320f789dcf6640ad97ca";
    public static final String SEALBOX_DECRYPTEDTEXT="7468697320697320612074657374";
    public static final int    SEALBOX_CIPHERTEXT_LEN=62;
}