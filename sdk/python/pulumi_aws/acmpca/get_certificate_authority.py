# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetCertificateAuthorityResult',
    'AwaitableGetCertificateAuthorityResult',
    'get_certificate_authority',
    'get_certificate_authority_output',
]

@pulumi.output_type
class GetCertificateAuthorityResult:
    """
    A collection of values returned by getCertificateAuthority.
    """
    def __init__(__self__, arn=None, certificate=None, certificate_chain=None, certificate_signing_request=None, id=None, key_storage_security_standard=None, not_after=None, not_before=None, revocation_configurations=None, serial=None, status=None, tags=None, type=None, usage_mode=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if certificate and not isinstance(certificate, str):
            raise TypeError("Expected argument 'certificate' to be a str")
        pulumi.set(__self__, "certificate", certificate)
        if certificate_chain and not isinstance(certificate_chain, str):
            raise TypeError("Expected argument 'certificate_chain' to be a str")
        pulumi.set(__self__, "certificate_chain", certificate_chain)
        if certificate_signing_request and not isinstance(certificate_signing_request, str):
            raise TypeError("Expected argument 'certificate_signing_request' to be a str")
        pulumi.set(__self__, "certificate_signing_request", certificate_signing_request)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_storage_security_standard and not isinstance(key_storage_security_standard, str):
            raise TypeError("Expected argument 'key_storage_security_standard' to be a str")
        pulumi.set(__self__, "key_storage_security_standard", key_storage_security_standard)
        if not_after and not isinstance(not_after, str):
            raise TypeError("Expected argument 'not_after' to be a str")
        pulumi.set(__self__, "not_after", not_after)
        if not_before and not isinstance(not_before, str):
            raise TypeError("Expected argument 'not_before' to be a str")
        pulumi.set(__self__, "not_before", not_before)
        if revocation_configurations and not isinstance(revocation_configurations, list):
            raise TypeError("Expected argument 'revocation_configurations' to be a list")
        pulumi.set(__self__, "revocation_configurations", revocation_configurations)
        if serial and not isinstance(serial, str):
            raise TypeError("Expected argument 'serial' to be a str")
        pulumi.set(__self__, "serial", serial)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if usage_mode and not isinstance(usage_mode, str):
            raise TypeError("Expected argument 'usage_mode' to be a str")
        pulumi.set(__self__, "usage_mode", usage_mode)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def certificate(self) -> str:
        """
        Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> str:
        """
        Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter(name="certificateSigningRequest")
    def certificate_signing_request(self) -> str:
        """
        The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
        """
        return pulumi.get(self, "certificate_signing_request")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="keyStorageSecurityStandard")
    def key_storage_security_standard(self) -> str:
        return pulumi.get(self, "key_storage_security_standard")

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> str:
        """
        Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
        """
        return pulumi.get(self, "not_after")

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> str:
        """
        Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
        """
        return pulumi.get(self, "not_before")

    @property
    @pulumi.getter(name="revocationConfigurations")
    def revocation_configurations(self) -> Sequence['outputs.GetCertificateAuthorityRevocationConfigurationResult']:
        """
        Nested attribute containing revocation configuration.
        * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
        * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
        * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
        * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
        * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
        * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
        * `revocation_configuration.0.ocsp_configuration.0.enabled` - Boolean value that specifies whether a custom OCSP responder is enabled.
        * `revocation_configuration.0.ocsp_configuration.0.ocsp_custom_cname` - A CNAME specifying a customized OCSP domain.
        """
        return pulumi.get(self, "revocation_configurations")

    @property
    @pulumi.getter
    def serial(self) -> str:
        """
        Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
        """
        return pulumi.get(self, "serial")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the certificate authority.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Key-value map of user-defined tags that are attached to the certificate authority.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of the certificate authority.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="usageMode")
    def usage_mode(self) -> str:
        """
        Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly.
        """
        return pulumi.get(self, "usage_mode")


class AwaitableGetCertificateAuthorityResult(GetCertificateAuthorityResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificateAuthorityResult(
            arn=self.arn,
            certificate=self.certificate,
            certificate_chain=self.certificate_chain,
            certificate_signing_request=self.certificate_signing_request,
            id=self.id,
            key_storage_security_standard=self.key_storage_security_standard,
            not_after=self.not_after,
            not_before=self.not_before,
            revocation_configurations=self.revocation_configurations,
            serial=self.serial,
            status=self.status,
            tags=self.tags,
            type=self.type,
            usage_mode=self.usage_mode)


def get_certificate_authority(arn: Optional[str] = None,
                              tags: Optional[Mapping[str, str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificateAuthorityResult:
    """
    Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.acmpca.get_certificate_authority(arn="arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012")
    ```
    <!--End PulumiCodeChooser -->


    :param str arn: ARN of the certificate authority.
    :param Mapping[str, str] tags: Key-value map of user-defined tags that are attached to the certificate authority.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:acmpca/getCertificateAuthority:getCertificateAuthority', __args__, opts=opts, typ=GetCertificateAuthorityResult).value

    return AwaitableGetCertificateAuthorityResult(
        arn=pulumi.get(__ret__, 'arn'),
        certificate=pulumi.get(__ret__, 'certificate'),
        certificate_chain=pulumi.get(__ret__, 'certificate_chain'),
        certificate_signing_request=pulumi.get(__ret__, 'certificate_signing_request'),
        id=pulumi.get(__ret__, 'id'),
        key_storage_security_standard=pulumi.get(__ret__, 'key_storage_security_standard'),
        not_after=pulumi.get(__ret__, 'not_after'),
        not_before=pulumi.get(__ret__, 'not_before'),
        revocation_configurations=pulumi.get(__ret__, 'revocation_configurations'),
        serial=pulumi.get(__ret__, 'serial'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        type=pulumi.get(__ret__, 'type'),
        usage_mode=pulumi.get(__ret__, 'usage_mode'))


@_utilities.lift_output_func(get_certificate_authority)
def get_certificate_authority_output(arn: Optional[pulumi.Input[str]] = None,
                                     tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCertificateAuthorityResult]:
    """
    Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.acmpca.get_certificate_authority(arn="arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012")
    ```
    <!--End PulumiCodeChooser -->


    :param str arn: ARN of the certificate authority.
    :param Mapping[str, str] tags: Key-value map of user-defined tags that are attached to the certificate authority.
    """
    ...
