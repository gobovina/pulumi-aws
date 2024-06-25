# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['CertificateArgs', 'Certificate']

@pulumi.input_type
class CertificateArgs:
    def __init__(__self__, *,
                 certificate: pulumi.Input[str],
                 usage: pulumi.Input[str],
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Certificate resource.
        :param pulumi.Input[str] certificate: The valid certificate file required for the transfer.
        :param pulumi.Input[str] usage: Specifies if a certificate is being used for signing or encryption. The valid values are SIGNING and ENCRYPTION.
        :param pulumi.Input[str] certificate_chain: The optional list of certificate that make up the chain for the certificate that is being imported.
        :param pulumi.Input[str] description: A short description that helps identify the certificate.
        :param pulumi.Input[str] private_key: The private key associated with the certificate being imported.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "certificate", certificate)
        pulumi.set(__self__, "usage", usage)
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Input[str]:
        """
        The valid certificate file required for the transfer.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter
    def usage(self) -> pulumi.Input[str]:
        """
        Specifies if a certificate is being used for signing or encryption. The valid values are SIGNING and ENCRYPTION.
        """
        return pulumi.get(self, "usage")

    @usage.setter
    def usage(self, value: pulumi.Input[str]):
        pulumi.set(self, "usage", value)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The optional list of certificate that make up the chain for the certificate that is being imported.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A short description that helps identify the certificate.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The private key associated with the certificate being imported.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _CertificateState:
    def __init__(__self__, *,
                 active_date: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inactive_date: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 usage: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Certificate resources.
        :param pulumi.Input[str] active_date: An date when the certificate becomes active
        :param pulumi.Input[str] arn: The ARN of the certificate
        :param pulumi.Input[str] certificate: The valid certificate file required for the transfer.
        :param pulumi.Input[str] certificate_chain: The optional list of certificate that make up the chain for the certificate that is being imported.
        :param pulumi.Input[str] certificate_id: The unique identifier for the AS2 certificate
        :param pulumi.Input[str] description: A short description that helps identify the certificate.
        :param pulumi.Input[str] inactive_date: An date when the certificate becomes inactive
        :param pulumi.Input[str] private_key: The private key associated with the certificate being imported.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] usage: Specifies if a certificate is being used for signing or encryption. The valid values are SIGNING and ENCRYPTION.
        """
        if active_date is not None:
            pulumi.set(__self__, "active_date", active_date)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if certificate_id is not None:
            pulumi.set(__self__, "certificate_id", certificate_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if inactive_date is not None:
            pulumi.set(__self__, "inactive_date", inactive_date)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if usage is not None:
            pulumi.set(__self__, "usage", usage)

    @property
    @pulumi.getter(name="activeDate")
    def active_date(self) -> Optional[pulumi.Input[str]]:
        """
        An date when the certificate becomes active
        """
        return pulumi.get(self, "active_date")

    @active_date.setter
    def active_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "active_date", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the certificate
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The valid certificate file required for the transfer.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The optional list of certificate that make up the chain for the certificate that is being imported.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the AS2 certificate
        """
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A short description that helps identify the certificate.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="inactiveDate")
    def inactive_date(self) -> Optional[pulumi.Input[str]]:
        """
        An date when the certificate becomes inactive
        """
        return pulumi.get(self, "inactive_date")

    @inactive_date.setter
    def inactive_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inactive_date", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The private key associated with the certificate being imported.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def usage(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies if a certificate is being used for signing or encryption. The valid values are SIGNING and ENCRYPTION.
        """
        return pulumi.get(self, "usage")

    @usage.setter
    def usage(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "usage", value)


class Certificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 usage: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a AWS Transfer AS2 Certificate resource.

        ## Example Usage

        ## Import

        Using `pulumi import`, import Transfer AS2 Certificate using the `certificate_id`. For example:

        ```sh
        $ pulumi import aws:transfer/certificate:Certificate example c-4221a88afd5f4362a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The valid certificate file required for the transfer.
        :param pulumi.Input[str] certificate_chain: The optional list of certificate that make up the chain for the certificate that is being imported.
        :param pulumi.Input[str] description: A short description that helps identify the certificate.
        :param pulumi.Input[str] private_key: The private key associated with the certificate being imported.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] usage: Specifies if a certificate is being used for signing or encryption. The valid values are SIGNING and ENCRYPTION.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a AWS Transfer AS2 Certificate resource.

        ## Example Usage

        ## Import

        Using `pulumi import`, import Transfer AS2 Certificate using the `certificate_id`. For example:

        ```sh
        $ pulumi import aws:transfer/certificate:Certificate example c-4221a88afd5f4362a
        ```

        :param str resource_name: The name of the resource.
        :param CertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 usage: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertificateArgs.__new__(CertificateArgs)

            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__.__dict__["certificate"] = None if certificate is None else pulumi.Output.secret(certificate)
            __props__.__dict__["certificate_chain"] = None if certificate_chain is None else pulumi.Output.secret(certificate_chain)
            __props__.__dict__["description"] = description
            __props__.__dict__["private_key"] = None if private_key is None else pulumi.Output.secret(private_key)
            __props__.__dict__["tags"] = tags
            if usage is None and not opts.urn:
                raise TypeError("Missing required property 'usage'")
            __props__.__dict__["usage"] = usage
            __props__.__dict__["active_date"] = None
            __props__.__dict__["arn"] = None
            __props__.__dict__["certificate_id"] = None
            __props__.__dict__["inactive_date"] = None
            __props__.__dict__["tags_all"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["certificate", "certificateChain", "privateKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Certificate, __self__).__init__(
            'aws:transfer/certificate:Certificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active_date: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            certificate_chain: Optional[pulumi.Input[str]] = None,
            certificate_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            inactive_date: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            usage: Optional[pulumi.Input[str]] = None) -> 'Certificate':
        """
        Get an existing Certificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] active_date: An date when the certificate becomes active
        :param pulumi.Input[str] arn: The ARN of the certificate
        :param pulumi.Input[str] certificate: The valid certificate file required for the transfer.
        :param pulumi.Input[str] certificate_chain: The optional list of certificate that make up the chain for the certificate that is being imported.
        :param pulumi.Input[str] certificate_id: The unique identifier for the AS2 certificate
        :param pulumi.Input[str] description: A short description that helps identify the certificate.
        :param pulumi.Input[str] inactive_date: An date when the certificate becomes inactive
        :param pulumi.Input[str] private_key: The private key associated with the certificate being imported.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] usage: Specifies if a certificate is being used for signing or encryption. The valid values are SIGNING and ENCRYPTION.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertificateState.__new__(_CertificateState)

        __props__.__dict__["active_date"] = active_date
        __props__.__dict__["arn"] = arn
        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["certificate_chain"] = certificate_chain
        __props__.__dict__["certificate_id"] = certificate_id
        __props__.__dict__["description"] = description
        __props__.__dict__["inactive_date"] = inactive_date
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["usage"] = usage
        return Certificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="activeDate")
    def active_date(self) -> pulumi.Output[str]:
        """
        An date when the certificate becomes active
        """
        return pulumi.get(self, "active_date")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the certificate
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The valid certificate file required for the transfer.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> pulumi.Output[Optional[str]]:
        """
        The optional list of certificate that make up the chain for the certificate that is being imported.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the AS2 certificate
        """
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A short description that helps identify the certificate.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="inactiveDate")
    def inactive_date(self) -> pulumi.Output[str]:
        """
        An date when the certificate becomes inactive
        """
        return pulumi.get(self, "inactive_date")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[Optional[str]]:
        """
        The private key associated with the certificate being imported.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def usage(self) -> pulumi.Output[str]:
        """
        Specifies if a certificate is being used for signing or encryption. The valid values are SIGNING and ENCRYPTION.
        """
        return pulumi.get(self, "usage")

