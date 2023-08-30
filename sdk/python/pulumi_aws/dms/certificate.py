# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['CertificateArgs', 'Certificate']

@pulumi.input_type
class CertificateArgs:
    def __init__(__self__, *,
                 certificate_id: pulumi.Input[str],
                 certificate_pem: Optional[pulumi.Input[str]] = None,
                 certificate_wallet: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Certificate resource.
        :param pulumi.Input[str] certificate_id: The certificate identifier.
               
               - Must contain from 1 to 255 alphanumeric characters and hyphens.
        :param pulumi.Input[str] certificate_pem: The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[str] certificate_wallet: The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "certificate_id", certificate_id)
        if certificate_pem is not None:
            pulumi.set(__self__, "certificate_pem", certificate_pem)
        if certificate_wallet is not None:
            pulumi.set(__self__, "certificate_wallet", certificate_wallet)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> pulumi.Input[str]:
        """
        The certificate identifier.

        - Must contain from 1 to 255 alphanumeric characters and hyphens.
        """
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter(name="certificatePem")
    def certificate_pem(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
        """
        return pulumi.get(self, "certificate_pem")

    @certificate_pem.setter
    def certificate_pem(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_pem", value)

    @property
    @pulumi.getter(name="certificateWallet")
    def certificate_wallet(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
        """
        return pulumi.get(self, "certificate_wallet")

    @certificate_wallet.setter
    def certificate_wallet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_wallet", value)

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
                 certificate_arn: Optional[pulumi.Input[str]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificate_pem: Optional[pulumi.Input[str]] = None,
                 certificate_wallet: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Certificate resources.
        :param pulumi.Input[str] certificate_arn: The Amazon Resource Name (ARN) for the certificate.
        :param pulumi.Input[str] certificate_id: The certificate identifier.
               
               - Must contain from 1 to 255 alphanumeric characters and hyphens.
        :param pulumi.Input[str] certificate_pem: The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[str] certificate_wallet: The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if certificate_arn is not None:
            pulumi.set(__self__, "certificate_arn", certificate_arn)
        if certificate_id is not None:
            pulumi.set(__self__, "certificate_id", certificate_id)
        if certificate_pem is not None:
            pulumi.set(__self__, "certificate_pem", certificate_pem)
        if certificate_wallet is not None:
            pulumi.set(__self__, "certificate_wallet", certificate_wallet)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) for the certificate.
        """
        return pulumi.get(self, "certificate_arn")

    @certificate_arn.setter
    def certificate_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_arn", value)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate identifier.

        - Must contain from 1 to 255 alphanumeric characters and hyphens.
        """
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter(name="certificatePem")
    def certificate_pem(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
        """
        return pulumi.get(self, "certificate_pem")

    @certificate_pem.setter
    def certificate_pem(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_pem", value)

    @property
    @pulumi.getter(name="certificateWallet")
    def certificate_wallet(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
        """
        return pulumi.get(self, "certificate_wallet")

    @certificate_wallet.setter
    def certificate_wallet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_wallet", value)

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
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Certificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificate_pem: Optional[pulumi.Input[str]] = None,
                 certificate_wallet: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a DMS (Data Migration Service) certificate resource. DMS certificates can be created, deleted, and imported.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        # Create a new certificate
        test = aws.dms.Certificate("test",
            certificate_id="test-dms-certificate-tf",
            certificate_pem="...",
            tags={
                "Name": "test",
            })
        ```

        ## Import

        Using `pulumi import`, import certificates using the `certificate_id`. For example:

        ```sh
         $ pulumi import aws:dms/certificate:Certificate test test-dms-certificate-tf
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_id: The certificate identifier.
               
               - Must contain from 1 to 255 alphanumeric characters and hyphens.
        :param pulumi.Input[str] certificate_pem: The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[str] certificate_wallet: The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DMS (Data Migration Service) certificate resource. DMS certificates can be created, deleted, and imported.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        # Create a new certificate
        test = aws.dms.Certificate("test",
            certificate_id="test-dms-certificate-tf",
            certificate_pem="...",
            tags={
                "Name": "test",
            })
        ```

        ## Import

        Using `pulumi import`, import certificates using the `certificate_id`. For example:

        ```sh
         $ pulumi import aws:dms/certificate:Certificate test test-dms-certificate-tf
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
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificate_pem: Optional[pulumi.Input[str]] = None,
                 certificate_wallet: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertificateArgs.__new__(CertificateArgs)

            if certificate_id is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_id'")
            __props__.__dict__["certificate_id"] = certificate_id
            __props__.__dict__["certificate_pem"] = None if certificate_pem is None else pulumi.Output.secret(certificate_pem)
            __props__.__dict__["certificate_wallet"] = None if certificate_wallet is None else pulumi.Output.secret(certificate_wallet)
            __props__.__dict__["tags"] = tags
            __props__.__dict__["certificate_arn"] = None
            __props__.__dict__["tags_all"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["certificatePem", "certificateWallet"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Certificate, __self__).__init__(
            'aws:dms/certificate:Certificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_arn: Optional[pulumi.Input[str]] = None,
            certificate_id: Optional[pulumi.Input[str]] = None,
            certificate_pem: Optional[pulumi.Input[str]] = None,
            certificate_wallet: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Certificate':
        """
        Get an existing Certificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_arn: The Amazon Resource Name (ARN) for the certificate.
        :param pulumi.Input[str] certificate_id: The certificate identifier.
               
               - Must contain from 1 to 255 alphanumeric characters and hyphens.
        :param pulumi.Input[str] certificate_pem: The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[str] certificate_wallet: The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertificateState.__new__(_CertificateState)

        __props__.__dict__["certificate_arn"] = certificate_arn
        __props__.__dict__["certificate_id"] = certificate_id
        __props__.__dict__["certificate_pem"] = certificate_pem
        __props__.__dict__["certificate_wallet"] = certificate_wallet
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Certificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) for the certificate.
        """
        return pulumi.get(self, "certificate_arn")

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> pulumi.Output[str]:
        """
        The certificate identifier.

        - Must contain from 1 to 255 alphanumeric characters and hyphens.
        """
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter(name="certificatePem")
    def certificate_pem(self) -> pulumi.Output[Optional[str]]:
        """
        The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
        """
        return pulumi.get(self, "certificate_pem")

    @property
    @pulumi.getter(name="certificateWallet")
    def certificate_wallet(self) -> pulumi.Output[Optional[str]]:
        """
        The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
        """
        return pulumi.get(self, "certificate_wallet")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

