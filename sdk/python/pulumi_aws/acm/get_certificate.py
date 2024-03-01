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
    def __init__(__self__, arn=None, certificate=None, certificate_chain=None, domain=None, id=None, key_types=None, most_recent=None, status=None, statuses=None, tags=None, types=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if certificate and not isinstance(certificate, str):
            raise TypeError("Expected argument 'certificate' to be a str")
        pulumi.set(__self__, "certificate", certificate)
        if certificate_chain and not isinstance(certificate_chain, str):
            raise TypeError("Expected argument 'certificate_chain' to be a str")
        pulumi.set(__self__, "certificate_chain", certificate_chain)
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_types and not isinstance(key_types, list):
            raise TypeError("Expected argument 'key_types' to be a list")
        pulumi.set(__self__, "key_types", key_types)
        if most_recent and not isinstance(most_recent, bool):
            raise TypeError("Expected argument 'most_recent' to be a bool")
        pulumi.set(__self__, "most_recent", most_recent)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if statuses and not isinstance(statuses, list):
            raise TypeError("Expected argument 'statuses' to be a list")
        pulumi.set(__self__, "statuses", statuses)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if types and not isinstance(types, list):
            raise TypeError("Expected argument 'types' to be a list")
        pulumi.set(__self__, "types", types)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the found certificate, suitable for referencing in other resources that support ACM certificates.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def certificate(self) -> str:
        """
        ACM-issued certificate.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> str:
        """
        Certificates forming the requested ACM-issued certificate's chain of trust. The chain consists of the certificate of the issuing CA and the intermediate certificates of any other subordinate CAs.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter
    def domain(self) -> str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="keyTypes")
    def key_types(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "key_types")

    @property
    @pulumi.getter(name="mostRecent")
    def most_recent(self) -> Optional[bool]:
        return pulumi.get(self, "most_recent")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the found certificate.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def statuses(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "statuses")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Mapping of tags for the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def types(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "types")


class AwaitableGetCertificateResult(GetCertificateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificateResult(
            arn=self.arn,
            certificate=self.certificate,
            certificate_chain=self.certificate_chain,
            domain=self.domain,
            id=self.id,
            key_types=self.key_types,
            most_recent=self.most_recent,
            status=self.status,
            statuses=self.statuses,
            tags=self.tags,
            types=self.types)


def get_certificate(domain: Optional[str] = None,
                    key_types: Optional[Sequence[str]] = None,
                    most_recent: Optional[bool] = None,
                    statuses: Optional[Sequence[str]] = None,
                    tags: Optional[Mapping[str, str]] = None,
                    types: Optional[Sequence[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificateResult:
    """
    Use this data source to get the ARN of a certificate in AWS Certificate
    Manager (ACM), you can reference
    it by domain without having to hard code the ARNs as input.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    # Find a certificate that is issued
    issued = aws.acm.get_certificate(domain="tf.example.com",
        statuses=["ISSUED"])
    # Find a certificate issued by (not imported into) ACM
    amazon_issued = aws.acm.get_certificate(domain="tf.example.com",
        types=["AMAZON_ISSUED"],
        most_recent=True)
    # Find a RSA 4096 bit certificate
    rsa4096 = aws.acm.get_certificate(domain="tf.example.com",
        key_types=["RSA_4096"])
    ```


    :param str domain: Domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
    :param Sequence[str] key_types: List of key algorithms to filter certificates. By default, ACM does not return all certificate types when searching. See the [ACM API Reference](https://docs.aws.amazon.com/acm/latest/APIReference/API_CertificateDetail.html#ACM-Type-CertificateDetail-KeyAlgorithm) for supported key algorithms.
    :param bool most_recent: If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
    :param Sequence[str] statuses: List of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
           `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
           are returned.
    :param Mapping[str, str] tags: Mapping of tags for the resource.
    :param Sequence[str] types: List of types on which to filter the returned list. Valid values are `AMAZON_ISSUED`, `PRIVATE`, and `IMPORTED`.
    """
    __args__ = dict()
    __args__['domain'] = domain
    __args__['keyTypes'] = key_types
    __args__['mostRecent'] = most_recent
    __args__['statuses'] = statuses
    __args__['tags'] = tags
    __args__['types'] = types
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:acm/getCertificate:getCertificate', __args__, opts=opts, typ=GetCertificateResult).value

    return AwaitableGetCertificateResult(
        arn=pulumi.get(__ret__, 'arn'),
        certificate=pulumi.get(__ret__, 'certificate'),
        certificate_chain=pulumi.get(__ret__, 'certificate_chain'),
        domain=pulumi.get(__ret__, 'domain'),
        id=pulumi.get(__ret__, 'id'),
        key_types=pulumi.get(__ret__, 'key_types'),
        most_recent=pulumi.get(__ret__, 'most_recent'),
        status=pulumi.get(__ret__, 'status'),
        statuses=pulumi.get(__ret__, 'statuses'),
        tags=pulumi.get(__ret__, 'tags'),
        types=pulumi.get(__ret__, 'types'))


@_utilities.lift_output_func(get_certificate)
def get_certificate_output(domain: Optional[pulumi.Input[str]] = None,
                           key_types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           most_recent: Optional[pulumi.Input[Optional[bool]]] = None,
                           statuses: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                           types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCertificateResult]:
    """
    Use this data source to get the ARN of a certificate in AWS Certificate
    Manager (ACM), you can reference
    it by domain without having to hard code the ARNs as input.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    # Find a certificate that is issued
    issued = aws.acm.get_certificate(domain="tf.example.com",
        statuses=["ISSUED"])
    # Find a certificate issued by (not imported into) ACM
    amazon_issued = aws.acm.get_certificate(domain="tf.example.com",
        types=["AMAZON_ISSUED"],
        most_recent=True)
    # Find a RSA 4096 bit certificate
    rsa4096 = aws.acm.get_certificate(domain="tf.example.com",
        key_types=["RSA_4096"])
    ```


    :param str domain: Domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
    :param Sequence[str] key_types: List of key algorithms to filter certificates. By default, ACM does not return all certificate types when searching. See the [ACM API Reference](https://docs.aws.amazon.com/acm/latest/APIReference/API_CertificateDetail.html#ACM-Type-CertificateDetail-KeyAlgorithm) for supported key algorithms.
    :param bool most_recent: If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
    :param Sequence[str] statuses: List of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
           `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
           are returned.
    :param Mapping[str, str] tags: Mapping of tags for the resource.
    :param Sequence[str] types: List of types on which to filter the returned list. Valid values are `AMAZON_ISSUED`, `PRIVATE`, and `IMPORTED`.
    """
    ...
