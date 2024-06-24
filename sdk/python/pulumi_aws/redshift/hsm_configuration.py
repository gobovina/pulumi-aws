# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HsmConfigurationArgs', 'HsmConfiguration']

@pulumi.input_type
class HsmConfigurationArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 hsm_configuration_identifier: pulumi.Input[str],
                 hsm_ip_address: pulumi.Input[str],
                 hsm_partition_name: pulumi.Input[str],
                 hsm_partition_password: pulumi.Input[str],
                 hsm_server_public_certificate: pulumi.Input[str],
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a HsmConfiguration resource.
        :param pulumi.Input[str] description: A text description of the HSM configuration to be created.
        :param pulumi.Input[str] hsm_configuration_identifier: The identifier to be assigned to the new Amazon Redshift HSM configuration.
        :param pulumi.Input[str] hsm_ip_address: The IP address that the Amazon Redshift cluster must use to access the HSM.
        :param pulumi.Input[str] hsm_partition_name: The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
        :param pulumi.Input[str] hsm_partition_password: The password required to access the HSM partition.
        :param pulumi.Input[str] hsm_server_public_certificate: The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "hsm_configuration_identifier", hsm_configuration_identifier)
        pulumi.set(__self__, "hsm_ip_address", hsm_ip_address)
        pulumi.set(__self__, "hsm_partition_name", hsm_partition_name)
        pulumi.set(__self__, "hsm_partition_password", hsm_partition_password)
        pulumi.set(__self__, "hsm_server_public_certificate", hsm_server_public_certificate)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        A text description of the HSM configuration to be created.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="hsmConfigurationIdentifier")
    def hsm_configuration_identifier(self) -> pulumi.Input[str]:
        """
        The identifier to be assigned to the new Amazon Redshift HSM configuration.
        """
        return pulumi.get(self, "hsm_configuration_identifier")

    @hsm_configuration_identifier.setter
    def hsm_configuration_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "hsm_configuration_identifier", value)

    @property
    @pulumi.getter(name="hsmIpAddress")
    def hsm_ip_address(self) -> pulumi.Input[str]:
        """
        The IP address that the Amazon Redshift cluster must use to access the HSM.
        """
        return pulumi.get(self, "hsm_ip_address")

    @hsm_ip_address.setter
    def hsm_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "hsm_ip_address", value)

    @property
    @pulumi.getter(name="hsmPartitionName")
    def hsm_partition_name(self) -> pulumi.Input[str]:
        """
        The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
        """
        return pulumi.get(self, "hsm_partition_name")

    @hsm_partition_name.setter
    def hsm_partition_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "hsm_partition_name", value)

    @property
    @pulumi.getter(name="hsmPartitionPassword")
    def hsm_partition_password(self) -> pulumi.Input[str]:
        """
        The password required to access the HSM partition.
        """
        return pulumi.get(self, "hsm_partition_password")

    @hsm_partition_password.setter
    def hsm_partition_password(self, value: pulumi.Input[str]):
        pulumi.set(self, "hsm_partition_password", value)

    @property
    @pulumi.getter(name="hsmServerPublicCertificate")
    def hsm_server_public_certificate(self) -> pulumi.Input[str]:
        """
        The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
        """
        return pulumi.get(self, "hsm_server_public_certificate")

    @hsm_server_public_certificate.setter
    def hsm_server_public_certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "hsm_server_public_certificate", value)

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
class _HsmConfigurationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 hsm_configuration_identifier: Optional[pulumi.Input[str]] = None,
                 hsm_ip_address: Optional[pulumi.Input[str]] = None,
                 hsm_partition_name: Optional[pulumi.Input[str]] = None,
                 hsm_partition_password: Optional[pulumi.Input[str]] = None,
                 hsm_server_public_certificate: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering HsmConfiguration resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the Hsm Client Certificate.
        :param pulumi.Input[str] description: A text description of the HSM configuration to be created.
        :param pulumi.Input[str] hsm_configuration_identifier: The identifier to be assigned to the new Amazon Redshift HSM configuration.
        :param pulumi.Input[str] hsm_ip_address: The IP address that the Amazon Redshift cluster must use to access the HSM.
        :param pulumi.Input[str] hsm_partition_name: The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
        :param pulumi.Input[str] hsm_partition_password: The password required to access the HSM partition.
        :param pulumi.Input[str] hsm_server_public_certificate: The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if hsm_configuration_identifier is not None:
            pulumi.set(__self__, "hsm_configuration_identifier", hsm_configuration_identifier)
        if hsm_ip_address is not None:
            pulumi.set(__self__, "hsm_ip_address", hsm_ip_address)
        if hsm_partition_name is not None:
            pulumi.set(__self__, "hsm_partition_name", hsm_partition_name)
        if hsm_partition_password is not None:
            pulumi.set(__self__, "hsm_partition_password", hsm_partition_password)
        if hsm_server_public_certificate is not None:
            pulumi.set(__self__, "hsm_server_public_certificate", hsm_server_public_certificate)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the Hsm Client Certificate.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A text description of the HSM configuration to be created.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="hsmConfigurationIdentifier")
    def hsm_configuration_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier to be assigned to the new Amazon Redshift HSM configuration.
        """
        return pulumi.get(self, "hsm_configuration_identifier")

    @hsm_configuration_identifier.setter
    def hsm_configuration_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hsm_configuration_identifier", value)

    @property
    @pulumi.getter(name="hsmIpAddress")
    def hsm_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address that the Amazon Redshift cluster must use to access the HSM.
        """
        return pulumi.get(self, "hsm_ip_address")

    @hsm_ip_address.setter
    def hsm_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hsm_ip_address", value)

    @property
    @pulumi.getter(name="hsmPartitionName")
    def hsm_partition_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
        """
        return pulumi.get(self, "hsm_partition_name")

    @hsm_partition_name.setter
    def hsm_partition_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hsm_partition_name", value)

    @property
    @pulumi.getter(name="hsmPartitionPassword")
    def hsm_partition_password(self) -> Optional[pulumi.Input[str]]:
        """
        The password required to access the HSM partition.
        """
        return pulumi.get(self, "hsm_partition_password")

    @hsm_partition_password.setter
    def hsm_partition_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hsm_partition_password", value)

    @property
    @pulumi.getter(name="hsmServerPublicCertificate")
    def hsm_server_public_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
        """
        return pulumi.get(self, "hsm_server_public_certificate")

    @hsm_server_public_certificate.setter
    def hsm_server_public_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hsm_server_public_certificate", value)

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
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class HsmConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 hsm_configuration_identifier: Optional[pulumi.Input[str]] = None,
                 hsm_ip_address: Optional[pulumi.Input[str]] = None,
                 hsm_partition_name: Optional[pulumi.Input[str]] = None,
                 hsm_partition_password: Optional[pulumi.Input[str]] = None,
                 hsm_server_public_certificate: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.HsmConfiguration("example",
            description="example",
            hsm_configuration_identifier="example",
            hsm_ip_address="10.0.0.1",
            hsm_partition_name="aws",
            hsm_partition_password="example",
            hsm_server_public_certificate="example")
        ```

        ## Import

        Using `pulumi import`, import Redshift HSM Client Certificates using `hsm_configuration_identifier`. For example:

        ```sh
        $ pulumi import aws:redshift/hsmConfiguration:HsmConfiguration example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A text description of the HSM configuration to be created.
        :param pulumi.Input[str] hsm_configuration_identifier: The identifier to be assigned to the new Amazon Redshift HSM configuration.
        :param pulumi.Input[str] hsm_ip_address: The IP address that the Amazon Redshift cluster must use to access the HSM.
        :param pulumi.Input[str] hsm_partition_name: The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
        :param pulumi.Input[str] hsm_partition_password: The password required to access the HSM partition.
        :param pulumi.Input[str] hsm_server_public_certificate: The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HsmConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.HsmConfiguration("example",
            description="example",
            hsm_configuration_identifier="example",
            hsm_ip_address="10.0.0.1",
            hsm_partition_name="aws",
            hsm_partition_password="example",
            hsm_server_public_certificate="example")
        ```

        ## Import

        Using `pulumi import`, import Redshift HSM Client Certificates using `hsm_configuration_identifier`. For example:

        ```sh
        $ pulumi import aws:redshift/hsmConfiguration:HsmConfiguration example example
        ```

        :param str resource_name: The name of the resource.
        :param HsmConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HsmConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 hsm_configuration_identifier: Optional[pulumi.Input[str]] = None,
                 hsm_ip_address: Optional[pulumi.Input[str]] = None,
                 hsm_partition_name: Optional[pulumi.Input[str]] = None,
                 hsm_partition_password: Optional[pulumi.Input[str]] = None,
                 hsm_server_public_certificate: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HsmConfigurationArgs.__new__(HsmConfigurationArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if hsm_configuration_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'hsm_configuration_identifier'")
            __props__.__dict__["hsm_configuration_identifier"] = hsm_configuration_identifier
            if hsm_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'hsm_ip_address'")
            __props__.__dict__["hsm_ip_address"] = hsm_ip_address
            if hsm_partition_name is None and not opts.urn:
                raise TypeError("Missing required property 'hsm_partition_name'")
            __props__.__dict__["hsm_partition_name"] = hsm_partition_name
            if hsm_partition_password is None and not opts.urn:
                raise TypeError("Missing required property 'hsm_partition_password'")
            __props__.__dict__["hsm_partition_password"] = None if hsm_partition_password is None else pulumi.Output.secret(hsm_partition_password)
            if hsm_server_public_certificate is None and not opts.urn:
                raise TypeError("Missing required property 'hsm_server_public_certificate'")
            __props__.__dict__["hsm_server_public_certificate"] = hsm_server_public_certificate
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["hsmPartitionPassword"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(HsmConfiguration, __self__).__init__(
            'aws:redshift/hsmConfiguration:HsmConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            hsm_configuration_identifier: Optional[pulumi.Input[str]] = None,
            hsm_ip_address: Optional[pulumi.Input[str]] = None,
            hsm_partition_name: Optional[pulumi.Input[str]] = None,
            hsm_partition_password: Optional[pulumi.Input[str]] = None,
            hsm_server_public_certificate: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'HsmConfiguration':
        """
        Get an existing HsmConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the Hsm Client Certificate.
        :param pulumi.Input[str] description: A text description of the HSM configuration to be created.
        :param pulumi.Input[str] hsm_configuration_identifier: The identifier to be assigned to the new Amazon Redshift HSM configuration.
        :param pulumi.Input[str] hsm_ip_address: The IP address that the Amazon Redshift cluster must use to access the HSM.
        :param pulumi.Input[str] hsm_partition_name: The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
        :param pulumi.Input[str] hsm_partition_password: The password required to access the HSM partition.
        :param pulumi.Input[str] hsm_server_public_certificate: The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HsmConfigurationState.__new__(_HsmConfigurationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["hsm_configuration_identifier"] = hsm_configuration_identifier
        __props__.__dict__["hsm_ip_address"] = hsm_ip_address
        __props__.__dict__["hsm_partition_name"] = hsm_partition_name
        __props__.__dict__["hsm_partition_password"] = hsm_partition_password
        __props__.__dict__["hsm_server_public_certificate"] = hsm_server_public_certificate
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return HsmConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the Hsm Client Certificate.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A text description of the HSM configuration to be created.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="hsmConfigurationIdentifier")
    def hsm_configuration_identifier(self) -> pulumi.Output[str]:
        """
        The identifier to be assigned to the new Amazon Redshift HSM configuration.
        """
        return pulumi.get(self, "hsm_configuration_identifier")

    @property
    @pulumi.getter(name="hsmIpAddress")
    def hsm_ip_address(self) -> pulumi.Output[str]:
        """
        The IP address that the Amazon Redshift cluster must use to access the HSM.
        """
        return pulumi.get(self, "hsm_ip_address")

    @property
    @pulumi.getter(name="hsmPartitionName")
    def hsm_partition_name(self) -> pulumi.Output[str]:
        """
        The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
        """
        return pulumi.get(self, "hsm_partition_name")

    @property
    @pulumi.getter(name="hsmPartitionPassword")
    def hsm_partition_password(self) -> pulumi.Output[str]:
        """
        The password required to access the HSM partition.
        """
        return pulumi.get(self, "hsm_partition_password")

    @property
    @pulumi.getter(name="hsmServerPublicCertificate")
    def hsm_server_public_certificate(self) -> pulumi.Output[str]:
        """
        The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
        """
        return pulumi.get(self, "hsm_server_public_certificate")

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
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

