# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetCertificateResult',
    'AwaitableGetCertificateResult',
    'get_certificate',
    'get_certificate_output',
]

@pulumi.output_type
class GetCertificateResult:
    """
    A collection of values returned by getCertificate.
    """
    def __init__(__self__, certificate_arn=None, certificate_creation_date=None, certificate_id=None, certificate_owner=None, certificate_pem=None, certificate_wallet=None, id=None, key_length=None, signing_algorithm=None, tags=None, valid_from_date=None, valid_to_date=None):
        if certificate_arn and not isinstance(certificate_arn, str):
            raise TypeError("Expected argument 'certificate_arn' to be a str")
        pulumi.set(__self__, "certificate_arn", certificate_arn)
        if certificate_creation_date and not isinstance(certificate_creation_date, str):
            raise TypeError("Expected argument 'certificate_creation_date' to be a str")
        pulumi.set(__self__, "certificate_creation_date", certificate_creation_date)
        if certificate_id and not isinstance(certificate_id, str):
            raise TypeError("Expected argument 'certificate_id' to be a str")
        pulumi.set(__self__, "certificate_id", certificate_id)
        if certificate_owner and not isinstance(certificate_owner, str):
            raise TypeError("Expected argument 'certificate_owner' to be a str")
        pulumi.set(__self__, "certificate_owner", certificate_owner)
        if certificate_pem and not isinstance(certificate_pem, str):
            raise TypeError("Expected argument 'certificate_pem' to be a str")
        pulumi.set(__self__, "certificate_pem", certificate_pem)
        if certificate_wallet and not isinstance(certificate_wallet, str):
            raise TypeError("Expected argument 'certificate_wallet' to be a str")
        pulumi.set(__self__, "certificate_wallet", certificate_wallet)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_length and not isinstance(key_length, int):
            raise TypeError("Expected argument 'key_length' to be a int")
        pulumi.set(__self__, "key_length", key_length)
        if signing_algorithm and not isinstance(signing_algorithm, str):
            raise TypeError("Expected argument 'signing_algorithm' to be a str")
        pulumi.set(__self__, "signing_algorithm", signing_algorithm)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if valid_from_date and not isinstance(valid_from_date, str):
            raise TypeError("Expected argument 'valid_from_date' to be a str")
        pulumi.set(__self__, "valid_from_date", valid_from_date)
        if valid_to_date and not isinstance(valid_to_date, str):
            raise TypeError("Expected argument 'valid_to_date' to be a str")
        pulumi.set(__self__, "valid_to_date", valid_to_date)

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> str:
        """
        The Amazon Resource Name (ARN) for the certificate.
        """
        return pulumi.get(self, "certificate_arn")

    @property
    @pulumi.getter(name="certificateCreationDate")
    def certificate_creation_date(self) -> str:
        """
        The date that the certificate was created.
        """
        return pulumi.get(self, "certificate_creation_date")

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> str:
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter(name="certificateOwner")
    def certificate_owner(self) -> str:
        """
        The owner of the certificate.
        """
        return pulumi.get(self, "certificate_owner")

    @property
    @pulumi.getter(name="certificatePem")
    def certificate_pem(self) -> str:
        """
        The contents of a .pem file, which contains an X.509 certificate.
        """
        return pulumi.get(self, "certificate_pem")

    @property
    @pulumi.getter(name="certificateWallet")
    def certificate_wallet(self) -> str:
        """
        The owner of the certificate.
        """
        return pulumi.get(self, "certificate_wallet")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="keyLength")
    def key_length(self) -> int:
        """
        The key length of the cryptographic algorithm being used.
        """
        return pulumi.get(self, "key_length")

    @property
    @pulumi.getter(name="signingAlgorithm")
    def signing_algorithm(self) -> str:
        """
        The algorithm for the certificate.
        """
        return pulumi.get(self, "signing_algorithm")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="validFromDate")
    def valid_from_date(self) -> str:
        """
        The beginning date that the certificate is valid.
        """
        return pulumi.get(self, "valid_from_date")

    @property
    @pulumi.getter(name="validToDate")
    def valid_to_date(self) -> str:
        """
        The final date that the certificate is valid.
        """
        return pulumi.get(self, "valid_to_date")


class AwaitableGetCertificateResult(GetCertificateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificateResult(
            certificate_arn=self.certificate_arn,
            certificate_creation_date=self.certificate_creation_date,
            certificate_id=self.certificate_id,
            certificate_owner=self.certificate_owner,
            certificate_pem=self.certificate_pem,
            certificate_wallet=self.certificate_wallet,
            id=self.id,
            key_length=self.key_length,
            signing_algorithm=self.signing_algorithm,
            tags=self.tags,
            valid_from_date=self.valid_from_date,
            valid_to_date=self.valid_to_date)


def get_certificate(certificate_id: Optional[str] = None,
                    tags: Optional[Mapping[str, str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificateResult:
    """
    Data source for managing an AWS DMS (Database Migration) Certificate.

    ## Example Usage
    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.dms.get_certificate(certificate_id=test["certificateId"])
    ```


    :param str certificate_id: A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    """
    __args__ = dict()
    __args__['certificateId'] = certificate_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:dms/getCertificate:getCertificate', __args__, opts=opts, typ=GetCertificateResult).value

    return AwaitableGetCertificateResult(
        certificate_arn=pulumi.get(__ret__, 'certificate_arn'),
        certificate_creation_date=pulumi.get(__ret__, 'certificate_creation_date'),
        certificate_id=pulumi.get(__ret__, 'certificate_id'),
        certificate_owner=pulumi.get(__ret__, 'certificate_owner'),
        certificate_pem=pulumi.get(__ret__, 'certificate_pem'),
        certificate_wallet=pulumi.get(__ret__, 'certificate_wallet'),
        id=pulumi.get(__ret__, 'id'),
        key_length=pulumi.get(__ret__, 'key_length'),
        signing_algorithm=pulumi.get(__ret__, 'signing_algorithm'),
        tags=pulumi.get(__ret__, 'tags'),
        valid_from_date=pulumi.get(__ret__, 'valid_from_date'),
        valid_to_date=pulumi.get(__ret__, 'valid_to_date'))


@_utilities.lift_output_func(get_certificate)
def get_certificate_output(certificate_id: Optional[pulumi.Input[str]] = None,
                           tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCertificateResult]:
    """
    Data source for managing an AWS DMS (Database Migration) Certificate.

    ## Example Usage
    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.dms.get_certificate(certificate_id=test["certificateId"])
    ```


    :param str certificate_id: A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    """
    ...
