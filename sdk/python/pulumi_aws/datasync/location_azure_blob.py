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
from ._inputs import *

__all__ = ['LocationAzureBlobArgs', 'LocationAzureBlob']

@pulumi.input_type
class LocationAzureBlobArgs:
    def __init__(__self__, *,
                 agent_arns: pulumi.Input[Sequence[pulumi.Input[str]]],
                 authentication_type: pulumi.Input[str],
                 container_url: pulumi.Input[str],
                 access_tier: Optional[pulumi.Input[str]] = None,
                 blob_type: Optional[pulumi.Input[str]] = None,
                 sas_configuration: Optional[pulumi.Input['LocationAzureBlobSasConfigurationArgs']] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a LocationAzureBlob resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] agent_arns: A list of DataSync Agent ARNs with which this location will be associated.
        :param pulumi.Input[str] authentication_type: The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
        :param pulumi.Input[str] container_url: The URL of the Azure Blob Storage container involved in your transfer.
        :param pulumi.Input[str] access_tier: The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
        :param pulumi.Input[str] blob_type: The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
        :param pulumi.Input['LocationAzureBlobSasConfigurationArgs'] sas_configuration: The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
        :param pulumi.Input[str] subdirectory: Path segments if you want to limit your transfer to a virtual directory in the container.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "agent_arns", agent_arns)
        pulumi.set(__self__, "authentication_type", authentication_type)
        pulumi.set(__self__, "container_url", container_url)
        if access_tier is not None:
            pulumi.set(__self__, "access_tier", access_tier)
        if blob_type is not None:
            pulumi.set(__self__, "blob_type", blob_type)
        if sas_configuration is not None:
            pulumi.set(__self__, "sas_configuration", sas_configuration)
        if subdirectory is not None:
            pulumi.set(__self__, "subdirectory", subdirectory)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="agentArns")
    def agent_arns(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of DataSync Agent ARNs with which this location will be associated.
        """
        return pulumi.get(self, "agent_arns")

    @agent_arns.setter
    def agent_arns(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "agent_arns", value)

    @property
    @pulumi.getter(name="authenticationType")
    def authentication_type(self) -> pulumi.Input[str]:
        """
        The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
        """
        return pulumi.get(self, "authentication_type")

    @authentication_type.setter
    def authentication_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "authentication_type", value)

    @property
    @pulumi.getter(name="containerUrl")
    def container_url(self) -> pulumi.Input[str]:
        """
        The URL of the Azure Blob Storage container involved in your transfer.
        """
        return pulumi.get(self, "container_url")

    @container_url.setter
    def container_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "container_url", value)

    @property
    @pulumi.getter(name="accessTier")
    def access_tier(self) -> Optional[pulumi.Input[str]]:
        """
        The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
        """
        return pulumi.get(self, "access_tier")

    @access_tier.setter
    def access_tier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_tier", value)

    @property
    @pulumi.getter(name="blobType")
    def blob_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
        """
        return pulumi.get(self, "blob_type")

    @blob_type.setter
    def blob_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "blob_type", value)

    @property
    @pulumi.getter(name="sasConfiguration")
    def sas_configuration(self) -> Optional[pulumi.Input['LocationAzureBlobSasConfigurationArgs']]:
        """
        The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
        """
        return pulumi.get(self, "sas_configuration")

    @sas_configuration.setter
    def sas_configuration(self, value: Optional[pulumi.Input['LocationAzureBlobSasConfigurationArgs']]):
        pulumi.set(self, "sas_configuration", value)

    @property
    @pulumi.getter
    def subdirectory(self) -> Optional[pulumi.Input[str]]:
        """
        Path segments if you want to limit your transfer to a virtual directory in the container.
        """
        return pulumi.get(self, "subdirectory")

    @subdirectory.setter
    def subdirectory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdirectory", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LocationAzureBlobState:
    def __init__(__self__, *,
                 access_tier: Optional[pulumi.Input[str]] = None,
                 agent_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 authentication_type: Optional[pulumi.Input[str]] = None,
                 blob_type: Optional[pulumi.Input[str]] = None,
                 container_url: Optional[pulumi.Input[str]] = None,
                 sas_configuration: Optional[pulumi.Input['LocationAzureBlobSasConfigurationArgs']] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 uri: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LocationAzureBlob resources.
        :param pulumi.Input[str] access_tier: The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] agent_arns: A list of DataSync Agent ARNs with which this location will be associated.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Location.
        :param pulumi.Input[str] authentication_type: The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
        :param pulumi.Input[str] blob_type: The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
        :param pulumi.Input[str] container_url: The URL of the Azure Blob Storage container involved in your transfer.
        :param pulumi.Input['LocationAzureBlobSasConfigurationArgs'] sas_configuration: The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
        :param pulumi.Input[str] subdirectory: Path segments if you want to limit your transfer to a virtual directory in the container.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if access_tier is not None:
            pulumi.set(__self__, "access_tier", access_tier)
        if agent_arns is not None:
            pulumi.set(__self__, "agent_arns", agent_arns)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if authentication_type is not None:
            pulumi.set(__self__, "authentication_type", authentication_type)
        if blob_type is not None:
            pulumi.set(__self__, "blob_type", blob_type)
        if container_url is not None:
            pulumi.set(__self__, "container_url", container_url)
        if sas_configuration is not None:
            pulumi.set(__self__, "sas_configuration", sas_configuration)
        if subdirectory is not None:
            pulumi.set(__self__, "subdirectory", subdirectory)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter(name="accessTier")
    def access_tier(self) -> Optional[pulumi.Input[str]]:
        """
        The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
        """
        return pulumi.get(self, "access_tier")

    @access_tier.setter
    def access_tier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_tier", value)

    @property
    @pulumi.getter(name="agentArns")
    def agent_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of DataSync Agent ARNs with which this location will be associated.
        """
        return pulumi.get(self, "agent_arns")

    @agent_arns.setter
    def agent_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "agent_arns", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the DataSync Location.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="authenticationType")
    def authentication_type(self) -> Optional[pulumi.Input[str]]:
        """
        The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
        """
        return pulumi.get(self, "authentication_type")

    @authentication_type.setter
    def authentication_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authentication_type", value)

    @property
    @pulumi.getter(name="blobType")
    def blob_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
        """
        return pulumi.get(self, "blob_type")

    @blob_type.setter
    def blob_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "blob_type", value)

    @property
    @pulumi.getter(name="containerUrl")
    def container_url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the Azure Blob Storage container involved in your transfer.
        """
        return pulumi.get(self, "container_url")

    @container_url.setter
    def container_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_url", value)

    @property
    @pulumi.getter(name="sasConfiguration")
    def sas_configuration(self) -> Optional[pulumi.Input['LocationAzureBlobSasConfigurationArgs']]:
        """
        The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
        """
        return pulumi.get(self, "sas_configuration")

    @sas_configuration.setter
    def sas_configuration(self, value: Optional[pulumi.Input['LocationAzureBlobSasConfigurationArgs']]):
        pulumi.set(self, "sas_configuration", value)

    @property
    @pulumi.getter
    def subdirectory(self) -> Optional[pulumi.Input[str]]:
        """
        Path segments if you want to limit your transfer to a virtual directory in the container.
        """
        return pulumi.get(self, "subdirectory")

    @subdirectory.setter
    def subdirectory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdirectory", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)


class LocationAzureBlob(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_tier: Optional[pulumi.Input[str]] = None,
                 agent_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authentication_type: Optional[pulumi.Input[str]] = None,
                 blob_type: Optional[pulumi.Input[str]] = None,
                 container_url: Optional[pulumi.Input[str]] = None,
                 sas_configuration: Optional[pulumi.Input[pulumi.InputType['LocationAzureBlobSasConfigurationArgs']]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages a Microsoft Azure Blob Storage Location within AWS DataSync.

        > **NOTE:** The DataSync Agents must be available before creating this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datasync.LocationAzureBlob("example",
            agent_arns=[example_aws_datasync_agent["arn"]],
            authentication_type="SAS",
            container_url="https://example.com/path",
            sas_configuration=aws.datasync.LocationAzureBlobSasConfigurationArgs(
                token="sp=r&st=2023-12-20T14:54:52Z&se=2023-12-20T22:54:52Z&spr=https&sv=2021-06-08&sr=c&sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D",
            ))
        ```

        ## Import

        Using `pulumi import`, import `aws_datasync_location_azure_blob` using the Amazon Resource Name (ARN). For example:

        ```sh
         $ pulumi import aws:datasync/locationAzureBlob:LocationAzureBlob example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_tier: The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] agent_arns: A list of DataSync Agent ARNs with which this location will be associated.
        :param pulumi.Input[str] authentication_type: The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
        :param pulumi.Input[str] blob_type: The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
        :param pulumi.Input[str] container_url: The URL of the Azure Blob Storage container involved in your transfer.
        :param pulumi.Input[pulumi.InputType['LocationAzureBlobSasConfigurationArgs']] sas_configuration: The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
        :param pulumi.Input[str] subdirectory: Path segments if you want to limit your transfer to a virtual directory in the container.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LocationAzureBlobArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Microsoft Azure Blob Storage Location within AWS DataSync.

        > **NOTE:** The DataSync Agents must be available before creating this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datasync.LocationAzureBlob("example",
            agent_arns=[example_aws_datasync_agent["arn"]],
            authentication_type="SAS",
            container_url="https://example.com/path",
            sas_configuration=aws.datasync.LocationAzureBlobSasConfigurationArgs(
                token="sp=r&st=2023-12-20T14:54:52Z&se=2023-12-20T22:54:52Z&spr=https&sv=2021-06-08&sr=c&sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D",
            ))
        ```

        ## Import

        Using `pulumi import`, import `aws_datasync_location_azure_blob` using the Amazon Resource Name (ARN). For example:

        ```sh
         $ pulumi import aws:datasync/locationAzureBlob:LocationAzureBlob example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
        ```

        :param str resource_name: The name of the resource.
        :param LocationAzureBlobArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LocationAzureBlobArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_tier: Optional[pulumi.Input[str]] = None,
                 agent_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authentication_type: Optional[pulumi.Input[str]] = None,
                 blob_type: Optional[pulumi.Input[str]] = None,
                 container_url: Optional[pulumi.Input[str]] = None,
                 sas_configuration: Optional[pulumi.Input[pulumi.InputType['LocationAzureBlobSasConfigurationArgs']]] = None,
                 subdirectory: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LocationAzureBlobArgs.__new__(LocationAzureBlobArgs)

            __props__.__dict__["access_tier"] = access_tier
            if agent_arns is None and not opts.urn:
                raise TypeError("Missing required property 'agent_arns'")
            __props__.__dict__["agent_arns"] = agent_arns
            if authentication_type is None and not opts.urn:
                raise TypeError("Missing required property 'authentication_type'")
            __props__.__dict__["authentication_type"] = authentication_type
            __props__.__dict__["blob_type"] = blob_type
            if container_url is None and not opts.urn:
                raise TypeError("Missing required property 'container_url'")
            __props__.__dict__["container_url"] = container_url
            __props__.__dict__["sas_configuration"] = sas_configuration
            __props__.__dict__["subdirectory"] = subdirectory
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["uri"] = None
        super(LocationAzureBlob, __self__).__init__(
            'aws:datasync/locationAzureBlob:LocationAzureBlob',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_tier: Optional[pulumi.Input[str]] = None,
            agent_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            authentication_type: Optional[pulumi.Input[str]] = None,
            blob_type: Optional[pulumi.Input[str]] = None,
            container_url: Optional[pulumi.Input[str]] = None,
            sas_configuration: Optional[pulumi.Input[pulumi.InputType['LocationAzureBlobSasConfigurationArgs']]] = None,
            subdirectory: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            uri: Optional[pulumi.Input[str]] = None) -> 'LocationAzureBlob':
        """
        Get an existing LocationAzureBlob resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_tier: The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] agent_arns: A list of DataSync Agent ARNs with which this location will be associated.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DataSync Location.
        :param pulumi.Input[str] authentication_type: The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
        :param pulumi.Input[str] blob_type: The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
        :param pulumi.Input[str] container_url: The URL of the Azure Blob Storage container involved in your transfer.
        :param pulumi.Input[pulumi.InputType['LocationAzureBlobSasConfigurationArgs']] sas_configuration: The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
        :param pulumi.Input[str] subdirectory: Path segments if you want to limit your transfer to a virtual directory in the container.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LocationAzureBlobState.__new__(_LocationAzureBlobState)

        __props__.__dict__["access_tier"] = access_tier
        __props__.__dict__["agent_arns"] = agent_arns
        __props__.__dict__["arn"] = arn
        __props__.__dict__["authentication_type"] = authentication_type
        __props__.__dict__["blob_type"] = blob_type
        __props__.__dict__["container_url"] = container_url
        __props__.__dict__["sas_configuration"] = sas_configuration
        __props__.__dict__["subdirectory"] = subdirectory
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["uri"] = uri
        return LocationAzureBlob(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessTier")
    def access_tier(self) -> pulumi.Output[Optional[str]]:
        """
        The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
        """
        return pulumi.get(self, "access_tier")

    @property
    @pulumi.getter(name="agentArns")
    def agent_arns(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of DataSync Agent ARNs with which this location will be associated.
        """
        return pulumi.get(self, "agent_arns")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the DataSync Location.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="authenticationType")
    def authentication_type(self) -> pulumi.Output[str]:
        """
        The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
        """
        return pulumi.get(self, "authentication_type")

    @property
    @pulumi.getter(name="blobType")
    def blob_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
        """
        return pulumi.get(self, "blob_type")

    @property
    @pulumi.getter(name="containerUrl")
    def container_url(self) -> pulumi.Output[str]:
        """
        The URL of the Azure Blob Storage container involved in your transfer.
        """
        return pulumi.get(self, "container_url")

    @property
    @pulumi.getter(name="sasConfiguration")
    def sas_configuration(self) -> pulumi.Output[Optional['outputs.LocationAzureBlobSasConfiguration']]:
        """
        The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
        """
        return pulumi.get(self, "sas_configuration")

    @property
    @pulumi.getter
    def subdirectory(self) -> pulumi.Output[str]:
        """
        Path segments if you want to limit your transfer to a virtual directory in the container.
        """
        return pulumi.get(self, "subdirectory")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def uri(self) -> pulumi.Output[str]:
        return pulumi.get(self, "uri")

