# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'CertificateAuthorityCertificateAuthorityConfigurationArgs',
    'CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs',
    'CertificateAuthorityRevocationConfigurationArgs',
    'CertificateAuthorityRevocationConfigurationCrlConfigurationArgs',
    'CertificateValidityArgs',
    'GetCertificateAuthorityRevocationConfigurationArgs',
    'GetCertificateAuthorityRevocationConfigurationCrlConfigurationArgs',
]

@pulumi.input_type
class CertificateAuthorityCertificateAuthorityConfigurationArgs:
    def __init__(__self__, *,
                 key_algorithm: pulumi.Input[str],
                 signing_algorithm: pulumi.Input[str],
                 subject: pulumi.Input['CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs']):
        """
        :param pulumi.Input[str] key_algorithm: Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
        :param pulumi.Input[str] signing_algorithm: Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
        :param pulumi.Input['CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs'] subject: Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
        """
        pulumi.set(__self__, "key_algorithm", key_algorithm)
        pulumi.set(__self__, "signing_algorithm", signing_algorithm)
        pulumi.set(__self__, "subject", subject)

    @property
    @pulumi.getter(name="keyAlgorithm")
    def key_algorithm(self) -> pulumi.Input[str]:
        """
        Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
        """
        return pulumi.get(self, "key_algorithm")

    @key_algorithm.setter
    def key_algorithm(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_algorithm", value)

    @property
    @pulumi.getter(name="signingAlgorithm")
    def signing_algorithm(self) -> pulumi.Input[str]:
        """
        Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
        """
        return pulumi.get(self, "signing_algorithm")

    @signing_algorithm.setter
    def signing_algorithm(self, value: pulumi.Input[str]):
        pulumi.set(self, "signing_algorithm", value)

    @property
    @pulumi.getter
    def subject(self) -> pulumi.Input['CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs']:
        """
        Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
        """
        return pulumi.get(self, "subject")

    @subject.setter
    def subject(self, value: pulumi.Input['CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs']):
        pulumi.set(self, "subject", value)


@pulumi.input_type
class CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs:
    def __init__(__self__, *,
                 common_name: Optional[pulumi.Input[str]] = None,
                 country: Optional[pulumi.Input[str]] = None,
                 distinguished_name_qualifier: Optional[pulumi.Input[str]] = None,
                 generation_qualifier: Optional[pulumi.Input[str]] = None,
                 given_name: Optional[pulumi.Input[str]] = None,
                 initials: Optional[pulumi.Input[str]] = None,
                 locality: Optional[pulumi.Input[str]] = None,
                 organization: Optional[pulumi.Input[str]] = None,
                 organizational_unit: Optional[pulumi.Input[str]] = None,
                 pseudonym: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 surname: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] common_name: Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
        :param pulumi.Input[str] country: Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
        :param pulumi.Input[str] distinguished_name_qualifier: Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
        :param pulumi.Input[str] generation_qualifier: Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
        :param pulumi.Input[str] given_name: First name. Must be less than or equal to 16 characters in length.
        :param pulumi.Input[str] initials: Concatenation that typically contains the first letter of the `given_name`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
        :param pulumi.Input[str] locality: The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
        :param pulumi.Input[str] organization: Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
        :param pulumi.Input[str] organizational_unit: A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
        :param pulumi.Input[str] pseudonym: Typically a shortened version of a longer `given_name`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
        :param pulumi.Input[str] state: State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
        :param pulumi.Input[str] surname: Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
        :param pulumi.Input[str] title: A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
        """
        if common_name is not None:
            pulumi.set(__self__, "common_name", common_name)
        if country is not None:
            pulumi.set(__self__, "country", country)
        if distinguished_name_qualifier is not None:
            pulumi.set(__self__, "distinguished_name_qualifier", distinguished_name_qualifier)
        if generation_qualifier is not None:
            pulumi.set(__self__, "generation_qualifier", generation_qualifier)
        if given_name is not None:
            pulumi.set(__self__, "given_name", given_name)
        if initials is not None:
            pulumi.set(__self__, "initials", initials)
        if locality is not None:
            pulumi.set(__self__, "locality", locality)
        if organization is not None:
            pulumi.set(__self__, "organization", organization)
        if organizational_unit is not None:
            pulumi.set(__self__, "organizational_unit", organizational_unit)
        if pseudonym is not None:
            pulumi.set(__self__, "pseudonym", pseudonym)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if surname is not None:
            pulumi.set(__self__, "surname", surname)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter(name="commonName")
    def common_name(self) -> Optional[pulumi.Input[str]]:
        """
        Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
        """
        return pulumi.get(self, "common_name")

    @common_name.setter
    def common_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "common_name", value)

    @property
    @pulumi.getter
    def country(self) -> Optional[pulumi.Input[str]]:
        """
        Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
        """
        return pulumi.get(self, "country")

    @country.setter
    def country(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "country", value)

    @property
    @pulumi.getter(name="distinguishedNameQualifier")
    def distinguished_name_qualifier(self) -> Optional[pulumi.Input[str]]:
        """
        Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
        """
        return pulumi.get(self, "distinguished_name_qualifier")

    @distinguished_name_qualifier.setter
    def distinguished_name_qualifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "distinguished_name_qualifier", value)

    @property
    @pulumi.getter(name="generationQualifier")
    def generation_qualifier(self) -> Optional[pulumi.Input[str]]:
        """
        Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
        """
        return pulumi.get(self, "generation_qualifier")

    @generation_qualifier.setter
    def generation_qualifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "generation_qualifier", value)

    @property
    @pulumi.getter(name="givenName")
    def given_name(self) -> Optional[pulumi.Input[str]]:
        """
        First name. Must be less than or equal to 16 characters in length.
        """
        return pulumi.get(self, "given_name")

    @given_name.setter
    def given_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "given_name", value)

    @property
    @pulumi.getter
    def initials(self) -> Optional[pulumi.Input[str]]:
        """
        Concatenation that typically contains the first letter of the `given_name`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
        """
        return pulumi.get(self, "initials")

    @initials.setter
    def initials(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "initials", value)

    @property
    @pulumi.getter
    def locality(self) -> Optional[pulumi.Input[str]]:
        """
        The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
        """
        return pulumi.get(self, "locality")

    @locality.setter
    def locality(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "locality", value)

    @property
    @pulumi.getter
    def organization(self) -> Optional[pulumi.Input[str]]:
        """
        Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
        """
        return pulumi.get(self, "organization")

    @organization.setter
    def organization(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization", value)

    @property
    @pulumi.getter(name="organizationalUnit")
    def organizational_unit(self) -> Optional[pulumi.Input[str]]:
        """
        A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
        """
        return pulumi.get(self, "organizational_unit")

    @organizational_unit.setter
    def organizational_unit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organizational_unit", value)

    @property
    @pulumi.getter
    def pseudonym(self) -> Optional[pulumi.Input[str]]:
        """
        Typically a shortened version of a longer `given_name`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
        """
        return pulumi.get(self, "pseudonym")

    @pseudonym.setter
    def pseudonym(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pseudonym", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def surname(self) -> Optional[pulumi.Input[str]]:
        """
        Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
        """
        return pulumi.get(self, "surname")

    @surname.setter
    def surname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "surname", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)


@pulumi.input_type
class CertificateAuthorityRevocationConfigurationArgs:
    def __init__(__self__, *,
                 crl_configuration: Optional[pulumi.Input['CertificateAuthorityRevocationConfigurationCrlConfigurationArgs']] = None):
        """
        :param pulumi.Input['CertificateAuthorityRevocationConfigurationCrlConfigurationArgs'] crl_configuration: Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
        """
        if crl_configuration is not None:
            pulumi.set(__self__, "crl_configuration", crl_configuration)

    @property
    @pulumi.getter(name="crlConfiguration")
    def crl_configuration(self) -> Optional[pulumi.Input['CertificateAuthorityRevocationConfigurationCrlConfigurationArgs']]:
        """
        Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
        """
        return pulumi.get(self, "crl_configuration")

    @crl_configuration.setter
    def crl_configuration(self, value: Optional[pulumi.Input['CertificateAuthorityRevocationConfigurationCrlConfigurationArgs']]):
        pulumi.set(self, "crl_configuration", value)


@pulumi.input_type
class CertificateAuthorityRevocationConfigurationCrlConfigurationArgs:
    def __init__(__self__, *,
                 expiration_in_days: pulumi.Input[int],
                 custom_cname: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 s3_bucket_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[int] expiration_in_days: Number of days until a certificate expires. Must be between 1 and 5000.
        :param pulumi.Input[str] custom_cname: Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
        :param pulumi.Input[bool] enabled: Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
        :param pulumi.Input[str] s3_bucket_name: Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
        """
        pulumi.set(__self__, "expiration_in_days", expiration_in_days)
        if custom_cname is not None:
            pulumi.set(__self__, "custom_cname", custom_cname)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if s3_bucket_name is not None:
            pulumi.set(__self__, "s3_bucket_name", s3_bucket_name)

    @property
    @pulumi.getter(name="expirationInDays")
    def expiration_in_days(self) -> pulumi.Input[int]:
        """
        Number of days until a certificate expires. Must be between 1 and 5000.
        """
        return pulumi.get(self, "expiration_in_days")

    @expiration_in_days.setter
    def expiration_in_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "expiration_in_days", value)

    @property
    @pulumi.getter(name="customCname")
    def custom_cname(self) -> Optional[pulumi.Input[str]]:
        """
        Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
        """
        return pulumi.get(self, "custom_cname")

    @custom_cname.setter
    def custom_cname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_cname", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="s3BucketName")
    def s3_bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
        """
        return pulumi.get(self, "s3_bucket_name")

    @s3_bucket_name.setter
    def s3_bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "s3_bucket_name", value)


@pulumi.input_type
class CertificateValidityArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 value: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Determines how `value` is interpreted. Valid values: `DAYS`, `MONTHS`, `YEARS`, `ABSOLUTE`, `END_DATE`.
        :param pulumi.Input[str] value: If `type` is `DAYS`, `MONTHS`, or `YEARS`, the relative time until the certificate expires. If `type` is `ABSOLUTE`, the date in seconds since the Unix epoch. If `type` is `END_DATE`, the  date in RFC 3339 format.
        """
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Determines how `value` is interpreted. Valid values: `DAYS`, `MONTHS`, `YEARS`, `ABSOLUTE`, `END_DATE`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        If `type` is `DAYS`, `MONTHS`, or `YEARS`, the relative time until the certificate expires. If `type` is `ABSOLUTE`, the date in seconds since the Unix epoch. If `type` is `END_DATE`, the  date in RFC 3339 format.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class GetCertificateAuthorityRevocationConfigurationArgs:
    def __init__(__self__, *,
                 crl_configurations: Sequence['GetCertificateAuthorityRevocationConfigurationCrlConfigurationArgs']):
        pulumi.set(__self__, "crl_configurations", crl_configurations)

    @property
    @pulumi.getter(name="crlConfigurations")
    def crl_configurations(self) -> Sequence['GetCertificateAuthorityRevocationConfigurationCrlConfigurationArgs']:
        return pulumi.get(self, "crl_configurations")

    @crl_configurations.setter
    def crl_configurations(self, value: Sequence['GetCertificateAuthorityRevocationConfigurationCrlConfigurationArgs']):
        pulumi.set(self, "crl_configurations", value)


@pulumi.input_type
class GetCertificateAuthorityRevocationConfigurationCrlConfigurationArgs:
    def __init__(__self__, *,
                 custom_cname: str,
                 enabled: bool,
                 expiration_in_days: int,
                 s3_bucket_name: str):
        pulumi.set(__self__, "custom_cname", custom_cname)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "expiration_in_days", expiration_in_days)
        pulumi.set(__self__, "s3_bucket_name", s3_bucket_name)

    @property
    @pulumi.getter(name="customCname")
    def custom_cname(self) -> str:
        return pulumi.get(self, "custom_cname")

    @custom_cname.setter
    def custom_cname(self, value: str):
        pulumi.set(self, "custom_cname", value)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: bool):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="expirationInDays")
    def expiration_in_days(self) -> int:
        return pulumi.get(self, "expiration_in_days")

    @expiration_in_days.setter
    def expiration_in_days(self, value: int):
        pulumi.set(self, "expiration_in_days", value)

    @property
    @pulumi.getter(name="s3BucketName")
    def s3_bucket_name(self) -> str:
        return pulumi.get(self, "s3_bucket_name")

    @s3_bucket_name.setter
    def s3_bucket_name(self, value: str):
        pulumi.set(self, "s3_bucket_name", value)


