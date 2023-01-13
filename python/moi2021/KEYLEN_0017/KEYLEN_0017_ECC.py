from Crypto.PublicKey import RSA, DSA, ECC
from tinyec import registry
import secrets


def bad_RSA():
    private_key = RSA.generate(1024)
    public_key = private_key.publickey()


def bad_ECC():
    ecc_curve = registry.get_curve('secp192r1')
    private_key = secrets.randbelow(ecc_curve.field.n)
    public_key = private_key * ecc_curve.g


def good_RSA():

    private_key = RSA.generate(2048)
    public_key = private_key.publickey()


def good_ECC():

    ecc_curve = registry.get_curve('secp256r1')
    private_key = secrets.randbelow(ecc_curve.field.n)
    public_key = private_key * ecc_curve.g