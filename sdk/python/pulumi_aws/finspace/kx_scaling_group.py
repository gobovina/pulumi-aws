# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['KxScalingGroupArgs', 'KxScalingGroup']

@pulumi.input_type
class KxScalingGroupArgs:
    def __init__(__self__, *,
                 availability_zone_id: pulumi.Input[str],
                 environment_id: pulumi.Input[str],
                 host_type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a KxScalingGroup resource.
        :param pulumi.Input[str] availability_zone_id: The availability zone identifiers for the requested regions.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, where you want to create the scaling group.
        :param pulumi.Input[str] host_type: The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
               
               The following arguments are optional:
        :param pulumi.Input[str] name: Unique name for the scaling group that you want to create.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
        """
        pulumi.set(__self__, "availability_zone_id", availability_zone_id)
        pulumi.set(__self__, "environment_id", environment_id)
        pulumi.set(__self__, "host_type", host_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availabilityZoneId")
    def availability_zone_id(self) -> pulumi.Input[str]:
        """
        The availability zone identifiers for the requested regions.
        """
        return pulumi.get(self, "availability_zone_id")

    @availability_zone_id.setter
    def availability_zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "availability_zone_id", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        A unique identifier for the kdb environment, where you want to create the scaling group.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="hostType")
    def host_type(self) -> pulumi.Input[str]:
        """
        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.

        The following arguments are optional:
        """
        return pulumi.get(self, "host_type")

    @host_type.setter
    def host_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name for the scaling group that you want to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _KxScalingGroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 availability_zone_id: Optional[pulumi.Input[str]] = None,
                 clusters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 created_timestamp: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 host_type: Optional[pulumi.Input[str]] = None,
                 last_modified_timestamp: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 status_reason: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering KxScalingGroup resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) identifier of the KX Scaling Group.
        :param pulumi.Input[str] availability_zone_id: The availability zone identifiers for the requested regions.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] clusters: The list of Managed kdb clusters that are currently active in the given scaling group.
        :param pulumi.Input[str] created_timestamp: The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, where you want to create the scaling group.
        :param pulumi.Input[str] host_type: The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
               
               The following arguments are optional:
        :param pulumi.Input[str] last_modified_timestamp: Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        :param pulumi.Input[str] name: Unique name for the scaling group that you want to create.
        :param pulumi.Input[str] status: The status of scaling group.
               * `CREATING` – The scaling group creation is in progress.
               * `CREATE_FAILED` – The scaling group creation has failed.
               * `ACTIVE` – The scaling group is active.
               * `UPDATING` – The scaling group is in the process of being updated.
               * `UPDATE_FAILED` – The update action failed.
               * `DELETING` – The scaling group is in the process of being deleted.
               * `DELETE_FAILED` – The system failed to delete the scaling group.
               * `DELETED` – The scaling group is successfully deleted.
        :param pulumi.Input[str] status_reason: The error message when a failed state occurs.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if availability_zone_id is not None:
            pulumi.set(__self__, "availability_zone_id", availability_zone_id)
        if clusters is not None:
            pulumi.set(__self__, "clusters", clusters)
        if created_timestamp is not None:
            pulumi.set(__self__, "created_timestamp", created_timestamp)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if host_type is not None:
            pulumi.set(__self__, "host_type", host_type)
        if last_modified_timestamp is not None:
            pulumi.set(__self__, "last_modified_timestamp", last_modified_timestamp)
        if name is not None:
            pulumi.set(__self__, "name", name)
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

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) identifier of the KX Scaling Group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="availabilityZoneId")
    def availability_zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The availability zone identifiers for the requested regions.
        """
        return pulumi.get(self, "availability_zone_id")

    @availability_zone_id.setter
    def availability_zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "availability_zone_id", value)

    @property
    @pulumi.getter
    def clusters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of Managed kdb clusters that are currently active in the given scaling group.
        """
        return pulumi.get(self, "clusters")

    @clusters.setter
    def clusters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "clusters", value)

    @property
    @pulumi.getter(name="createdTimestamp")
    def created_timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        """
        return pulumi.get(self, "created_timestamp")

    @created_timestamp.setter
    def created_timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_timestamp", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        A unique identifier for the kdb environment, where you want to create the scaling group.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="hostType")
    def host_type(self) -> Optional[pulumi.Input[str]]:
        """
        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.

        The following arguments are optional:
        """
        return pulumi.get(self, "host_type")

    @host_type.setter
    def host_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_type", value)

    @property
    @pulumi.getter(name="lastModifiedTimestamp")
    def last_modified_timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        """
        return pulumi.get(self, "last_modified_timestamp")

    @last_modified_timestamp.setter
    def last_modified_timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified_timestamp", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name for the scaling group that you want to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of scaling group.
        * `CREATING` – The scaling group creation is in progress.
        * `CREATE_FAILED` – The scaling group creation has failed.
        * `ACTIVE` – The scaling group is active.
        * `UPDATING` – The scaling group is in the process of being updated.
        * `UPDATE_FAILED` – The update action failed.
        * `DELETING` – The scaling group is in the process of being deleted.
        * `DELETE_FAILED` – The system failed to delete the scaling group.
        * `DELETED` – The scaling group is successfully deleted.
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
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
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
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class KxScalingGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone_id: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 host_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS FinSpace Kx Scaling Group.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.finspace.KxScalingGroup("example",
            name="my-tf-kx-scalinggroup",
            environment_id=example_aws_finspace_kx_environment["id"],
            availability_zone_id="use1-az2",
            host_type="kx.sg.4xlarge")
        ```

        ## Import

        Using `pulumi import`, import an AWS FinSpace Kx Scaling Group using the `id` (environment ID and scaling group name, comma-delimited). For example:

        ```sh
        $ pulumi import aws:finspace/kxScalingGroup:KxScalingGroup example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-scalinggroup
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone_id: The availability zone identifiers for the requested regions.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, where you want to create the scaling group.
        :param pulumi.Input[str] host_type: The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
               
               The following arguments are optional:
        :param pulumi.Input[str] name: Unique name for the scaling group that you want to create.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KxScalingGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS FinSpace Kx Scaling Group.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.finspace.KxScalingGroup("example",
            name="my-tf-kx-scalinggroup",
            environment_id=example_aws_finspace_kx_environment["id"],
            availability_zone_id="use1-az2",
            host_type="kx.sg.4xlarge")
        ```

        ## Import

        Using `pulumi import`, import an AWS FinSpace Kx Scaling Group using the `id` (environment ID and scaling group name, comma-delimited). For example:

        ```sh
        $ pulumi import aws:finspace/kxScalingGroup:KxScalingGroup example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-scalinggroup
        ```

        :param str resource_name: The name of the resource.
        :param KxScalingGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KxScalingGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone_id: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 host_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KxScalingGroupArgs.__new__(KxScalingGroupArgs)

            if availability_zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'availability_zone_id'")
            __props__.__dict__["availability_zone_id"] = availability_zone_id
            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            if host_type is None and not opts.urn:
                raise TypeError("Missing required property 'host_type'")
            __props__.__dict__["host_type"] = host_type
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["clusters"] = None
            __props__.__dict__["created_timestamp"] = None
            __props__.__dict__["last_modified_timestamp"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["status_reason"] = None
            __props__.__dict__["tags_all"] = None
        super(KxScalingGroup, __self__).__init__(
            'aws:finspace/kxScalingGroup:KxScalingGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            availability_zone_id: Optional[pulumi.Input[str]] = None,
            clusters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            created_timestamp: Optional[pulumi.Input[str]] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            host_type: Optional[pulumi.Input[str]] = None,
            last_modified_timestamp: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            status_reason: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'KxScalingGroup':
        """
        Get an existing KxScalingGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) identifier of the KX Scaling Group.
        :param pulumi.Input[str] availability_zone_id: The availability zone identifiers for the requested regions.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] clusters: The list of Managed kdb clusters that are currently active in the given scaling group.
        :param pulumi.Input[str] created_timestamp: The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        :param pulumi.Input[str] environment_id: A unique identifier for the kdb environment, where you want to create the scaling group.
        :param pulumi.Input[str] host_type: The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
               
               The following arguments are optional:
        :param pulumi.Input[str] last_modified_timestamp: Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        :param pulumi.Input[str] name: Unique name for the scaling group that you want to create.
        :param pulumi.Input[str] status: The status of scaling group.
               * `CREATING` – The scaling group creation is in progress.
               * `CREATE_FAILED` – The scaling group creation has failed.
               * `ACTIVE` – The scaling group is active.
               * `UPDATING` – The scaling group is in the process of being updated.
               * `UPDATE_FAILED` – The update action failed.
               * `DELETING` – The scaling group is in the process of being deleted.
               * `DELETE_FAILED` – The system failed to delete the scaling group.
               * `DELETED` – The scaling group is successfully deleted.
        :param pulumi.Input[str] status_reason: The error message when a failed state occurs.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KxScalingGroupState.__new__(_KxScalingGroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["availability_zone_id"] = availability_zone_id
        __props__.__dict__["clusters"] = clusters
        __props__.__dict__["created_timestamp"] = created_timestamp
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["host_type"] = host_type
        __props__.__dict__["last_modified_timestamp"] = last_modified_timestamp
        __props__.__dict__["name"] = name
        __props__.__dict__["status"] = status
        __props__.__dict__["status_reason"] = status_reason
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return KxScalingGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) identifier of the KX Scaling Group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZoneId")
    def availability_zone_id(self) -> pulumi.Output[str]:
        """
        The availability zone identifiers for the requested regions.
        """
        return pulumi.get(self, "availability_zone_id")

    @property
    @pulumi.getter
    def clusters(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of Managed kdb clusters that are currently active in the given scaling group.
        """
        return pulumi.get(self, "clusters")

    @property
    @pulumi.getter(name="createdTimestamp")
    def created_timestamp(self) -> pulumi.Output[str]:
        """
        The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        """
        return pulumi.get(self, "created_timestamp")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        A unique identifier for the kdb environment, where you want to create the scaling group.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter(name="hostType")
    def host_type(self) -> pulumi.Output[str]:
        """
        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.

        The following arguments are optional:
        """
        return pulumi.get(self, "host_type")

    @property
    @pulumi.getter(name="lastModifiedTimestamp")
    def last_modified_timestamp(self) -> pulumi.Output[str]:
        """
        Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        """
        return pulumi.get(self, "last_modified_timestamp")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Unique name for the scaling group that you want to create.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of scaling group.
        * `CREATING` – The scaling group creation is in progress.
        * `CREATE_FAILED` – The scaling group creation has failed.
        * `ACTIVE` – The scaling group is active.
        * `UPDATING` – The scaling group is in the process of being updated.
        * `UPDATE_FAILED` – The update action failed.
        * `DELETING` – The scaling group is in the process of being deleted.
        * `DELETE_FAILED` – The system failed to delete the scaling group.
        * `DELETED` – The scaling group is successfully deleted.
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
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

