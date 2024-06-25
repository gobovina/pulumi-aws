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
from . import outputs
from ._inputs import *

__all__ = ['ResourceSetArgs', 'ResourceSet']

@pulumi.input_type
class ResourceSetArgs:
    def __init__(__self__, *,
                 resource_set_name: pulumi.Input[str],
                 resource_set_type: pulumi.Input[str],
                 resources: pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]],
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ResourceSet resource.
        :param pulumi.Input[str] resource_set_name: Unique name describing the resource set.
        :param pulumi.Input[str] resource_set_type: Type of the resources in the resource set.
        :param pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]] resources: List of resources to add to this resource set. See below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        pulumi.set(__self__, "resource_set_name", resource_set_name)
        pulumi.set(__self__, "resource_set_type", resource_set_type)
        pulumi.set(__self__, "resources", resources)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="resourceSetName")
    def resource_set_name(self) -> pulumi.Input[str]:
        """
        Unique name describing the resource set.
        """
        return pulumi.get(self, "resource_set_name")

    @resource_set_name.setter
    def resource_set_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_set_name", value)

    @property
    @pulumi.getter(name="resourceSetType")
    def resource_set_type(self) -> pulumi.Input[str]:
        """
        Type of the resources in the resource set.
        """
        return pulumi.get(self, "resource_set_type")

    @resource_set_type.setter
    def resource_set_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_set_type", value)

    @property
    @pulumi.getter
    def resources(self) -> pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]]:
        """
        List of resources to add to this resource set. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "resources")

    @resources.setter
    def resources(self, value: pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]]):
        pulumi.set(self, "resources", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ResourceSetState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 resource_set_name: Optional[pulumi.Input[str]] = None,
                 resource_set_type: Optional[pulumi.Input[str]] = None,
                 resources: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ResourceSet resources.
        :param pulumi.Input[str] arn: ARN of the resource set
               * `resources.#.component_id` - Unique identified for DNS Target Resources, use for readiness checks.
        :param pulumi.Input[str] resource_set_name: Unique name describing the resource set.
        :param pulumi.Input[str] resource_set_type: Type of the resources in the resource set.
        :param pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]] resources: List of resources to add to this resource set. See below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if resource_set_name is not None:
            pulumi.set(__self__, "resource_set_name", resource_set_name)
        if resource_set_type is not None:
            pulumi.set(__self__, "resource_set_type", resource_set_type)
        if resources is not None:
            pulumi.set(__self__, "resources", resources)
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
        ARN of the resource set
        * `resources.#.component_id` - Unique identified for DNS Target Resources, use for readiness checks.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="resourceSetName")
    def resource_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name describing the resource set.
        """
        return pulumi.get(self, "resource_set_name")

    @resource_set_name.setter
    def resource_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_set_name", value)

    @property
    @pulumi.getter(name="resourceSetType")
    def resource_set_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the resources in the resource set.
        """
        return pulumi.get(self, "resource_set_type")

    @resource_set_type.setter
    def resource_set_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_set_type", value)

    @property
    @pulumi.getter
    def resources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]]]:
        """
        List of resources to add to this resource set. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "resources")

    @resources.setter
    def resources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceSetResourceArgs']]]]):
        pulumi.set(self, "resources", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
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


class ResourceSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 resource_set_name: Optional[pulumi.Input[str]] = None,
                 resource_set_type: Optional[pulumi.Input[str]] = None,
                 resources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResourceSetResourceArgs', 'ResourceSetResourceArgsDict']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an AWS Route 53 Recovery Readiness Resource Set.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.route53recoveryreadiness.ResourceSet("example",
            resource_set_name=my_cw_alarm_set,
            resource_set_type="AWS::CloudWatch::Alarm",
            resources=[{
                "resourceArn": example_aws_cloudwatch_metric_alarm["arn"],
            }])
        ```

        ## Import

        Using `pulumi import`, import Route53 Recovery Readiness resource set name using the resource set name. For example:

        ```sh
        $ pulumi import aws:route53recoveryreadiness/resourceSet:ResourceSet my-cw-alarm-set example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_set_name: Unique name describing the resource set.
        :param pulumi.Input[str] resource_set_type: Type of the resources in the resource set.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ResourceSetResourceArgs', 'ResourceSetResourceArgsDict']]]] resources: List of resources to add to this resource set. See below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AWS Route 53 Recovery Readiness Resource Set.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.route53recoveryreadiness.ResourceSet("example",
            resource_set_name=my_cw_alarm_set,
            resource_set_type="AWS::CloudWatch::Alarm",
            resources=[{
                "resourceArn": example_aws_cloudwatch_metric_alarm["arn"],
            }])
        ```

        ## Import

        Using `pulumi import`, import Route53 Recovery Readiness resource set name using the resource set name. For example:

        ```sh
        $ pulumi import aws:route53recoveryreadiness/resourceSet:ResourceSet my-cw-alarm-set example
        ```

        :param str resource_name: The name of the resource.
        :param ResourceSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 resource_set_name: Optional[pulumi.Input[str]] = None,
                 resource_set_type: Optional[pulumi.Input[str]] = None,
                 resources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResourceSetResourceArgs', 'ResourceSetResourceArgsDict']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceSetArgs.__new__(ResourceSetArgs)

            if resource_set_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_set_name'")
            __props__.__dict__["resource_set_name"] = resource_set_name
            if resource_set_type is None and not opts.urn:
                raise TypeError("Missing required property 'resource_set_type'")
            __props__.__dict__["resource_set_type"] = resource_set_type
            if resources is None and not opts.urn:
                raise TypeError("Missing required property 'resources'")
            __props__.__dict__["resources"] = resources
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(ResourceSet, __self__).__init__(
            'aws:route53recoveryreadiness/resourceSet:ResourceSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            resource_set_name: Optional[pulumi.Input[str]] = None,
            resource_set_type: Optional[pulumi.Input[str]] = None,
            resources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResourceSetResourceArgs', 'ResourceSetResourceArgsDict']]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'ResourceSet':
        """
        Get an existing ResourceSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the resource set
               * `resources.#.component_id` - Unique identified for DNS Target Resources, use for readiness checks.
        :param pulumi.Input[str] resource_set_name: Unique name describing the resource set.
        :param pulumi.Input[str] resource_set_type: Type of the resources in the resource set.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ResourceSetResourceArgs', 'ResourceSetResourceArgsDict']]]] resources: List of resources to add to this resource set. See below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceSetState.__new__(_ResourceSetState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["resource_set_name"] = resource_set_name
        __props__.__dict__["resource_set_type"] = resource_set_type
        __props__.__dict__["resources"] = resources
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return ResourceSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the resource set
        * `resources.#.component_id` - Unique identified for DNS Target Resources, use for readiness checks.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="resourceSetName")
    def resource_set_name(self) -> pulumi.Output[str]:
        """
        Unique name describing the resource set.
        """
        return pulumi.get(self, "resource_set_name")

    @property
    @pulumi.getter(name="resourceSetType")
    def resource_set_type(self) -> pulumi.Output[str]:
        """
        Type of the resources in the resource set.
        """
        return pulumi.get(self, "resource_set_type")

    @property
    @pulumi.getter
    def resources(self) -> pulumi.Output[Sequence['outputs.ResourceSetResource']]:
        """
        List of resources to add to this resource set. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "resources")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
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

