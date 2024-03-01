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

__all__ = ['GroupArgs', 'Group']

@pulumi.input_type
class GroupArgs:
    def __init__(__self__, *,
                 verifiedaccess_instance_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 policy_document: Optional[pulumi.Input[str]] = None,
                 sse_configuration: Optional[pulumi.Input['GroupSseConfigurationArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Group resource.
        :param pulumi.Input[str] verifiedaccess_instance_id: The id of the verified access instance this group is associated with.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of the verified access group.
        :param pulumi.Input[str] policy_document: The policy document that is associated with this resource.
        :param pulumi.Input['GroupSseConfigurationArgs'] sse_configuration: Configuration block to use KMS keys for server-side encryption.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "verifiedaccess_instance_id", verifiedaccess_instance_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if policy_document is not None:
            pulumi.set(__self__, "policy_document", policy_document)
        if sse_configuration is not None:
            pulumi.set(__self__, "sse_configuration", sse_configuration)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="verifiedaccessInstanceId")
    def verifiedaccess_instance_id(self) -> pulumi.Input[str]:
        """
        The id of the verified access instance this group is associated with.

        The following arguments are optional:
        """
        return pulumi.get(self, "verifiedaccess_instance_id")

    @verifiedaccess_instance_id.setter
    def verifiedaccess_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "verifiedaccess_instance_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the verified access group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="policyDocument")
    def policy_document(self) -> Optional[pulumi.Input[str]]:
        """
        The policy document that is associated with this resource.
        """
        return pulumi.get(self, "policy_document")

    @policy_document.setter
    def policy_document(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_document", value)

    @property
    @pulumi.getter(name="sseConfiguration")
    def sse_configuration(self) -> Optional[pulumi.Input['GroupSseConfigurationArgs']]:
        """
        Configuration block to use KMS keys for server-side encryption.
        """
        return pulumi.get(self, "sse_configuration")

    @sse_configuration.setter
    def sse_configuration(self, value: Optional[pulumi.Input['GroupSseConfigurationArgs']]):
        pulumi.set(self, "sse_configuration", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _GroupState:
    def __init__(__self__, *,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 deletion_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_updated_time: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 policy_document: Optional[pulumi.Input[str]] = None,
                 sse_configuration: Optional[pulumi.Input['GroupSseConfigurationArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 verifiedaccess_group_arn: Optional[pulumi.Input[str]] = None,
                 verifiedaccess_group_id: Optional[pulumi.Input[str]] = None,
                 verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Group resources.
        :param pulumi.Input[str] creation_time: Timestamp when the access group was created.
        :param pulumi.Input[str] deletion_time: Timestamp when the access group was deleted.
        :param pulumi.Input[str] description: Description of the verified access group.
        :param pulumi.Input[str] last_updated_time: Timestamp when the access group was last updated.
        :param pulumi.Input[str] owner: AWS account number owning this resource.
        :param pulumi.Input[str] policy_document: The policy document that is associated with this resource.
        :param pulumi.Input['GroupSseConfigurationArgs'] sse_configuration: Configuration block to use KMS keys for server-side encryption.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] verifiedaccess_group_arn: ARN of this verified acess group.
        :param pulumi.Input[str] verifiedaccess_group_id: ID of this verified access group.
        :param pulumi.Input[str] verifiedaccess_instance_id: The id of the verified access instance this group is associated with.
               
               The following arguments are optional:
        """
        if creation_time is not None:
            pulumi.set(__self__, "creation_time", creation_time)
        if deletion_time is not None:
            pulumi.set(__self__, "deletion_time", deletion_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_updated_time is not None:
            pulumi.set(__self__, "last_updated_time", last_updated_time)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if policy_document is not None:
            pulumi.set(__self__, "policy_document", policy_document)
        if sse_configuration is not None:
            pulumi.set(__self__, "sse_configuration", sse_configuration)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if verifiedaccess_group_arn is not None:
            pulumi.set(__self__, "verifiedaccess_group_arn", verifiedaccess_group_arn)
        if verifiedaccess_group_id is not None:
            pulumi.set(__self__, "verifiedaccess_group_id", verifiedaccess_group_id)
        if verifiedaccess_instance_id is not None:
            pulumi.set(__self__, "verifiedaccess_instance_id", verifiedaccess_instance_id)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp when the access group was created.
        """
        return pulumi.get(self, "creation_time")

    @creation_time.setter
    def creation_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_time", value)

    @property
    @pulumi.getter(name="deletionTime")
    def deletion_time(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp when the access group was deleted.
        """
        return pulumi.get(self, "deletion_time")

    @deletion_time.setter
    def deletion_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "deletion_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the verified access group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastUpdatedTime")
    def last_updated_time(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp when the access group was last updated.
        """
        return pulumi.get(self, "last_updated_time")

    @last_updated_time.setter
    def last_updated_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_time", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account number owning this resource.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="policyDocument")
    def policy_document(self) -> Optional[pulumi.Input[str]]:
        """
        The policy document that is associated with this resource.
        """
        return pulumi.get(self, "policy_document")

    @policy_document.setter
    def policy_document(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_document", value)

    @property
    @pulumi.getter(name="sseConfiguration")
    def sse_configuration(self) -> Optional[pulumi.Input['GroupSseConfigurationArgs']]:
        """
        Configuration block to use KMS keys for server-side encryption.
        """
        return pulumi.get(self, "sse_configuration")

    @sse_configuration.setter
    def sse_configuration(self, value: Optional[pulumi.Input['GroupSseConfigurationArgs']]):
        pulumi.set(self, "sse_configuration", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter(name="verifiedaccessGroupArn")
    def verifiedaccess_group_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of this verified acess group.
        """
        return pulumi.get(self, "verifiedaccess_group_arn")

    @verifiedaccess_group_arn.setter
    def verifiedaccess_group_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "verifiedaccess_group_arn", value)

    @property
    @pulumi.getter(name="verifiedaccessGroupId")
    def verifiedaccess_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of this verified access group.
        """
        return pulumi.get(self, "verifiedaccess_group_id")

    @verifiedaccess_group_id.setter
    def verifiedaccess_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "verifiedaccess_group_id", value)

    @property
    @pulumi.getter(name="verifiedaccessInstanceId")
    def verifiedaccess_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the verified access instance this group is associated with.

        The following arguments are optional:
        """
        return pulumi.get(self, "verifiedaccess_instance_id")

    @verifiedaccess_instance_id.setter
    def verifiedaccess_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "verifiedaccess_instance_id", value)


class Group(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 policy_document: Optional[pulumi.Input[str]] = None,
                 sse_configuration: Optional[pulumi.Input[pulumi.InputType['GroupSseConfigurationArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing a Verified Access Group.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.Group("example", verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the verified access group.
        :param pulumi.Input[str] policy_document: The policy document that is associated with this resource.
        :param pulumi.Input[pulumi.InputType['GroupSseConfigurationArgs']] sse_configuration: Configuration block to use KMS keys for server-side encryption.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] verifiedaccess_instance_id: The id of the verified access instance this group is associated with.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing a Verified Access Group.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.verifiedaccess.Group("example", verifiedaccess_instance_id=example_aws_verifiedaccess_instance["id"])
        ```

        :param str resource_name: The name of the resource.
        :param GroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 policy_document: Optional[pulumi.Input[str]] = None,
                 sse_configuration: Optional[pulumi.Input[pulumi.InputType['GroupSseConfigurationArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupArgs.__new__(GroupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["policy_document"] = policy_document
            __props__.__dict__["sse_configuration"] = sse_configuration
            __props__.__dict__["tags"] = tags
            if verifiedaccess_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'verifiedaccess_instance_id'")
            __props__.__dict__["verifiedaccess_instance_id"] = verifiedaccess_instance_id
            __props__.__dict__["creation_time"] = None
            __props__.__dict__["deletion_time"] = None
            __props__.__dict__["last_updated_time"] = None
            __props__.__dict__["owner"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["verifiedaccess_group_arn"] = None
            __props__.__dict__["verifiedaccess_group_id"] = None
        super(Group, __self__).__init__(
            'aws:verifiedaccess/group:Group',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            creation_time: Optional[pulumi.Input[str]] = None,
            deletion_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            last_updated_time: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            policy_document: Optional[pulumi.Input[str]] = None,
            sse_configuration: Optional[pulumi.Input[pulumi.InputType['GroupSseConfigurationArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            verifiedaccess_group_arn: Optional[pulumi.Input[str]] = None,
            verifiedaccess_group_id: Optional[pulumi.Input[str]] = None,
            verifiedaccess_instance_id: Optional[pulumi.Input[str]] = None) -> 'Group':
        """
        Get an existing Group resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] creation_time: Timestamp when the access group was created.
        :param pulumi.Input[str] deletion_time: Timestamp when the access group was deleted.
        :param pulumi.Input[str] description: Description of the verified access group.
        :param pulumi.Input[str] last_updated_time: Timestamp when the access group was last updated.
        :param pulumi.Input[str] owner: AWS account number owning this resource.
        :param pulumi.Input[str] policy_document: The policy document that is associated with this resource.
        :param pulumi.Input[pulumi.InputType['GroupSseConfigurationArgs']] sse_configuration: Configuration block to use KMS keys for server-side encryption.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] verifiedaccess_group_arn: ARN of this verified acess group.
        :param pulumi.Input[str] verifiedaccess_group_id: ID of this verified access group.
        :param pulumi.Input[str] verifiedaccess_instance_id: The id of the verified access instance this group is associated with.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupState.__new__(_GroupState)

        __props__.__dict__["creation_time"] = creation_time
        __props__.__dict__["deletion_time"] = deletion_time
        __props__.__dict__["description"] = description
        __props__.__dict__["last_updated_time"] = last_updated_time
        __props__.__dict__["owner"] = owner
        __props__.__dict__["policy_document"] = policy_document
        __props__.__dict__["sse_configuration"] = sse_configuration
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["verifiedaccess_group_arn"] = verifiedaccess_group_arn
        __props__.__dict__["verifiedaccess_group_id"] = verifiedaccess_group_id
        __props__.__dict__["verifiedaccess_instance_id"] = verifiedaccess_instance_id
        return Group(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> pulumi.Output[str]:
        """
        Timestamp when the access group was created.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="deletionTime")
    def deletion_time(self) -> pulumi.Output[str]:
        """
        Timestamp when the access group was deleted.
        """
        return pulumi.get(self, "deletion_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the verified access group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="lastUpdatedTime")
    def last_updated_time(self) -> pulumi.Output[str]:
        """
        Timestamp when the access group was last updated.
        """
        return pulumi.get(self, "last_updated_time")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        AWS account number owning this resource.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="policyDocument")
    def policy_document(self) -> pulumi.Output[Optional[str]]:
        """
        The policy document that is associated with this resource.
        """
        return pulumi.get(self, "policy_document")

    @property
    @pulumi.getter(name="sseConfiguration")
    def sse_configuration(self) -> pulumi.Output['outputs.GroupSseConfiguration']:
        """
        Configuration block to use KMS keys for server-side encryption.
        """
        return pulumi.get(self, "sse_configuration")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="verifiedaccessGroupArn")
    def verifiedaccess_group_arn(self) -> pulumi.Output[str]:
        """
        ARN of this verified acess group.
        """
        return pulumi.get(self, "verifiedaccess_group_arn")

    @property
    @pulumi.getter(name="verifiedaccessGroupId")
    def verifiedaccess_group_id(self) -> pulumi.Output[str]:
        """
        ID of this verified access group.
        """
        return pulumi.get(self, "verifiedaccess_group_id")

    @property
    @pulumi.getter(name="verifiedaccessInstanceId")
    def verifiedaccess_instance_id(self) -> pulumi.Output[str]:
        """
        The id of the verified access instance this group is associated with.

        The following arguments are optional:
        """
        return pulumi.get(self, "verifiedaccess_instance_id")

