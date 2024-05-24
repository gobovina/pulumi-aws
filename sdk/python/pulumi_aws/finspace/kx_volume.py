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

__all__ = ['KxVolumeArgs', 'KxVolume']

@pulumi.input_type
class KxVolumeArgs:
    def __init__(__self__, *,
                 availability_zones: pulumi.Input[Sequence[pulumi.Input[str]]],
                 az_mode: pulumi.Input[str],
                 environment_id: pulumi.Input[str],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nas1_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a KxVolume resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: The identifier of the AWS Availability Zone IDs.
               
               The following arguments are optional:
        :param pulumi.Input[str] az_mode: The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
               * `SINGLE` - Assigns one availability zone per volume.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, whose clusters can attach to the volume.
        :param pulumi.Input[str] type: The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        :param pulumi.Input[str] description: Description of the volume.
        :param pulumi.Input[str] name: Unique name for the volumr that you want to create.
        :param pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]] nas1_configurations: Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        """
        pulumi.set(__self__, "availability_zones", availability_zones)
        pulumi.set(__self__, "az_mode", az_mode)
        pulumi.set(__self__, "environment_id", environment_id)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nas1_configurations is not None:
            pulumi.set(__self__, "nas1_configurations", nas1_configurations)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The identifier of the AWS Availability Zone IDs.

        The following arguments are optional:
        """
        return pulumi.get(self, "availability_zones")

    @availability_zones.setter
    def availability_zones(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "availability_zones", value)

    @property
    @pulumi.getter(name="azMode")
    def az_mode(self) -> pulumi.Input[str]:
        """
        The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
        * `SINGLE` - Assigns one availability zone per volume.
        """
        return pulumi.get(self, "az_mode")

    @az_mode.setter
    def az_mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "az_mode", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        A unique identifier for the kdb environment, whose clusters can attach to the volume.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the volume.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name for the volumr that you want to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nas1Configurations")
    def nas1_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]]]:
        """
        Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        """
        return pulumi.get(self, "nas1_configurations")

    @nas1_configurations.setter
    def nas1_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]]]):
        pulumi.set(self, "nas1_configurations", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _KxVolumeState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 attached_clusters: Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeAttachedClusterArgs']]]] = None,
                 availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 az_mode: Optional[pulumi.Input[str]] = None,
                 created_timestamp: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 last_modified_timestamp: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nas1_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 status_reason: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KxVolume resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) identifier of the KX volume.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: The identifier of the AWS Availability Zone IDs.
               
               The following arguments are optional:
        :param pulumi.Input[str] az_mode: The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
               * `SINGLE` - Assigns one availability zone per volume.
        :param pulumi.Input[str] created_timestamp: The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        :param pulumi.Input[str] description: Description of the volume.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, whose clusters can attach to the volume.
        :param pulumi.Input[str] last_modified_timestamp: Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        :param pulumi.Input[str] name: Unique name for the volumr that you want to create.
        :param pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]] nas1_configurations: Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        :param pulumi.Input[str] status: The status of volume creation.
               * `CREATING` – The volume creation is in progress.
               * `CREATE_FAILED` – The volume creation has failed.
               * `ACTIVE` – The volume is active.
               * `UPDATING` – The volume is in the process of being updated.
               * `UPDATE_FAILED` – The update action failed.
               * `UPDATED` – The volume is successfully updated.
               * `DELETING` – The volume is in the process of being deleted.
               * `DELETE_FAILED` – The system failed to delete the volume.
               * `DELETED` – The volume is successfully deleted.
        :param pulumi.Input[str] status_reason: The error message when a failed state occurs.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        :param pulumi.Input[str] type: The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if attached_clusters is not None:
            pulumi.set(__self__, "attached_clusters", attached_clusters)
        if availability_zones is not None:
            pulumi.set(__self__, "availability_zones", availability_zones)
        if az_mode is not None:
            pulumi.set(__self__, "az_mode", az_mode)
        if created_timestamp is not None:
            pulumi.set(__self__, "created_timestamp", created_timestamp)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if last_modified_timestamp is not None:
            pulumi.set(__self__, "last_modified_timestamp", last_modified_timestamp)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nas1_configurations is not None:
            pulumi.set(__self__, "nas1_configurations", nas1_configurations)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if status_reason is not None:
            pulumi.set(__self__, "status_reason", status_reason)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) identifier of the KX volume.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="attachedClusters")
    def attached_clusters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeAttachedClusterArgs']]]]:
        return pulumi.get(self, "attached_clusters")

    @attached_clusters.setter
    def attached_clusters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeAttachedClusterArgs']]]]):
        pulumi.set(self, "attached_clusters", value)

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The identifier of the AWS Availability Zone IDs.

        The following arguments are optional:
        """
        return pulumi.get(self, "availability_zones")

    @availability_zones.setter
    def availability_zones(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "availability_zones", value)

    @property
    @pulumi.getter(name="azMode")
    def az_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
        * `SINGLE` - Assigns one availability zone per volume.
        """
        return pulumi.get(self, "az_mode")

    @az_mode.setter
    def az_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "az_mode", value)

    @property
    @pulumi.getter(name="createdTimestamp")
    def created_timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        """
        return pulumi.get(self, "created_timestamp")

    @created_timestamp.setter
    def created_timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_timestamp", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the volume.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        A unique identifier for the kdb environment, whose clusters can attach to the volume.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="lastModifiedTimestamp")
    def last_modified_timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        """
        return pulumi.get(self, "last_modified_timestamp")

    @last_modified_timestamp.setter
    def last_modified_timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified_timestamp", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name for the volumr that you want to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nas1Configurations")
    def nas1_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]]]:
        """
        Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        """
        return pulumi.get(self, "nas1_configurations")

    @nas1_configurations.setter
    def nas1_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KxVolumeNas1ConfigurationArgs']]]]):
        pulumi.set(self, "nas1_configurations", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of volume creation.
        * `CREATING` – The volume creation is in progress.
        * `CREATE_FAILED` – The volume creation has failed.
        * `ACTIVE` – The volume is active.
        * `UPDATING` – The volume is in the process of being updated.
        * `UPDATE_FAILED` – The update action failed.
        * `UPDATED` – The volume is successfully updated.
        * `DELETING` – The volume is in the process of being deleted.
        * `DELETE_FAILED` – The system failed to delete the volume.
        * `DELETED` – The volume is successfully deleted.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="statusReason")
    def status_reason(self) -> Optional[pulumi.Input[str]]:
        """
        The error message when a failed state occurs.
        """
        return pulumi.get(self, "status_reason")

    @status_reason.setter
    def status_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status_reason", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class KxVolume(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 az_mode: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nas1_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KxVolumeNas1ConfigurationArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS FinSpace Kx Volume.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.finspace.KxVolume("example",
            name="my-tf-kx-volume",
            environment_id=example_aws_finspace_kx_environment["id"],
            availability_zones="use1-az2",
            az_mode="SINGLE",
            type="NAS_1",
            nas1_configurations=[aws.finspace.KxVolumeNas1ConfigurationArgs(
                size=1200,
                type="SSD_250",
            )])
        ```

        ## Import

        Using `pulumi import`, import an AWS FinSpace Kx Volume using the `id` (environment ID and volume name, comma-delimited). For example:

        ```sh
        $ pulumi import aws:finspace/kxVolume:KxVolume example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-volume
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: The identifier of the AWS Availability Zone IDs.
               
               The following arguments are optional:
        :param pulumi.Input[str] az_mode: The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
               * `SINGLE` - Assigns one availability zone per volume.
        :param pulumi.Input[str] description: Description of the volume.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, whose clusters can attach to the volume.
        :param pulumi.Input[str] name: Unique name for the volumr that you want to create.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KxVolumeNas1ConfigurationArgs']]]] nas1_configurations: Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        :param pulumi.Input[str] type: The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KxVolumeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS FinSpace Kx Volume.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.finspace.KxVolume("example",
            name="my-tf-kx-volume",
            environment_id=example_aws_finspace_kx_environment["id"],
            availability_zones="use1-az2",
            az_mode="SINGLE",
            type="NAS_1",
            nas1_configurations=[aws.finspace.KxVolumeNas1ConfigurationArgs(
                size=1200,
                type="SSD_250",
            )])
        ```

        ## Import

        Using `pulumi import`, import an AWS FinSpace Kx Volume using the `id` (environment ID and volume name, comma-delimited). For example:

        ```sh
        $ pulumi import aws:finspace/kxVolume:KxVolume example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-volume
        ```

        :param str resource_name: The name of the resource.
        :param KxVolumeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KxVolumeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 az_mode: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 nas1_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KxVolumeNas1ConfigurationArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KxVolumeArgs.__new__(KxVolumeArgs)

            if availability_zones is None and not opts.urn:
                raise TypeError("Missing required property 'availability_zones'")
            __props__.__dict__["availability_zones"] = availability_zones
            if az_mode is None and not opts.urn:
                raise TypeError("Missing required property 'az_mode'")
            __props__.__dict__["az_mode"] = az_mode
            __props__.__dict__["description"] = description
            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            __props__.__dict__["name"] = name
            __props__.__dict__["nas1_configurations"] = nas1_configurations
            __props__.__dict__["tags"] = tags
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["attached_clusters"] = None
            __props__.__dict__["created_timestamp"] = None
            __props__.__dict__["last_modified_timestamp"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["status_reason"] = None
            __props__.__dict__["tags_all"] = None
        super(KxVolume, __self__).__init__(
            'aws:finspace/kxVolume:KxVolume',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            attached_clusters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KxVolumeAttachedClusterArgs']]]]] = None,
            availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            az_mode: Optional[pulumi.Input[str]] = None,
            created_timestamp: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            last_modified_timestamp: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            nas1_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KxVolumeNas1ConfigurationArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            status_reason: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'KxVolume':
        """
        Get an existing KxVolume resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) identifier of the KX volume.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: The identifier of the AWS Availability Zone IDs.
               
               The following arguments are optional:
        :param pulumi.Input[str] az_mode: The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
               * `SINGLE` - Assigns one availability zone per volume.
        :param pulumi.Input[str] created_timestamp: The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        :param pulumi.Input[str] description: Description of the volume.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, whose clusters can attach to the volume.
        :param pulumi.Input[str] last_modified_timestamp: Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        :param pulumi.Input[str] name: Unique name for the volumr that you want to create.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KxVolumeNas1ConfigurationArgs']]]] nas1_configurations: Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        :param pulumi.Input[str] status: The status of volume creation.
               * `CREATING` – The volume creation is in progress.
               * `CREATE_FAILED` – The volume creation has failed.
               * `ACTIVE` – The volume is active.
               * `UPDATING` – The volume is in the process of being updated.
               * `UPDATE_FAILED` – The update action failed.
               * `UPDATED` – The volume is successfully updated.
               * `DELETING` – The volume is in the process of being deleted.
               * `DELETE_FAILED` – The system failed to delete the volume.
               * `DELETED` – The volume is successfully deleted.
        :param pulumi.Input[str] status_reason: The error message when a failed state occurs.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        :param pulumi.Input[str] type: The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KxVolumeState.__new__(_KxVolumeState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["attached_clusters"] = attached_clusters
        __props__.__dict__["availability_zones"] = availability_zones
        __props__.__dict__["az_mode"] = az_mode
        __props__.__dict__["created_timestamp"] = created_timestamp
        __props__.__dict__["description"] = description
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["last_modified_timestamp"] = last_modified_timestamp
        __props__.__dict__["name"] = name
        __props__.__dict__["nas1_configurations"] = nas1_configurations
        __props__.__dict__["status"] = status
        __props__.__dict__["status_reason"] = status_reason
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        return KxVolume(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) identifier of the KX volume.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="attachedClusters")
    def attached_clusters(self) -> pulumi.Output[Sequence['outputs.KxVolumeAttachedCluster']]:
        return pulumi.get(self, "attached_clusters")

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> pulumi.Output[Sequence[str]]:
        """
        The identifier of the AWS Availability Zone IDs.

        The following arguments are optional:
        """
        return pulumi.get(self, "availability_zones")

    @property
    @pulumi.getter(name="azMode")
    def az_mode(self) -> pulumi.Output[str]:
        """
        The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
        * `SINGLE` - Assigns one availability zone per volume.
        """
        return pulumi.get(self, "az_mode")

    @property
    @pulumi.getter(name="createdTimestamp")
    def created_timestamp(self) -> pulumi.Output[str]:
        """
        The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        """
        return pulumi.get(self, "created_timestamp")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the volume.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        A unique identifier for the kdb environment, whose clusters can attach to the volume.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter(name="lastModifiedTimestamp")
    def last_modified_timestamp(self) -> pulumi.Output[str]:
        """
        Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        """
        return pulumi.get(self, "last_modified_timestamp")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Unique name for the volumr that you want to create.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nas1Configurations")
    def nas1_configurations(self) -> pulumi.Output[Optional[Sequence['outputs.KxVolumeNas1Configuration']]]:
        """
        Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        """
        return pulumi.get(self, "nas1_configurations")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of volume creation.
        * `CREATING` – The volume creation is in progress.
        * `CREATE_FAILED` – The volume creation has failed.
        * `ACTIVE` – The volume is active.
        * `UPDATING` – The volume is in the process of being updated.
        * `UPDATE_FAILED` – The update action failed.
        * `UPDATED` – The volume is successfully updated.
        * `DELETING` – The volume is in the process of being deleted.
        * `DELETE_FAILED` – The system failed to delete the volume.
        * `DELETED` – The volume is successfully deleted.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusReason")
    def status_reason(self) -> pulumi.Output[str]:
        """
        The error message when a failed state occurs.
        """
        return pulumi.get(self, "status_reason")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        """
        return pulumi.get(self, "type")

