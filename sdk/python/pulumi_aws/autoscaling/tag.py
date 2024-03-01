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

__all__ = ['TagArgs', 'Tag']

@pulumi.input_type
class TagArgs:
    def __init__(__self__, *,
                 autoscaling_group_name: pulumi.Input[str],
                 tag: pulumi.Input['TagTagArgs']):
        """
        The set of arguments for constructing a Tag resource.
        :param pulumi.Input[str] autoscaling_group_name: Name of the Autoscaling Group to apply the tag to.
        :param pulumi.Input['TagTagArgs'] tag: Tag to create. The `tag` block is documented below.
        """
        pulumi.set(__self__, "autoscaling_group_name", autoscaling_group_name)
        pulumi.set(__self__, "tag", tag)

    @property
    @pulumi.getter(name="autoscalingGroupName")
    def autoscaling_group_name(self) -> pulumi.Input[str]:
        """
        Name of the Autoscaling Group to apply the tag to.
        """
        return pulumi.get(self, "autoscaling_group_name")

    @autoscaling_group_name.setter
    def autoscaling_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "autoscaling_group_name", value)

    @property
    @pulumi.getter
    def tag(self) -> pulumi.Input['TagTagArgs']:
        """
        Tag to create. The `tag` block is documented below.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: pulumi.Input['TagTagArgs']):
        pulumi.set(self, "tag", value)


@pulumi.input_type
class _TagState:
    def __init__(__self__, *,
                 autoscaling_group_name: Optional[pulumi.Input[str]] = None,
                 tag: Optional[pulumi.Input['TagTagArgs']] = None):
        """
        Input properties used for looking up and filtering Tag resources.
        :param pulumi.Input[str] autoscaling_group_name: Name of the Autoscaling Group to apply the tag to.
        :param pulumi.Input['TagTagArgs'] tag: Tag to create. The `tag` block is documented below.
        """
        if autoscaling_group_name is not None:
            pulumi.set(__self__, "autoscaling_group_name", autoscaling_group_name)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)

    @property
    @pulumi.getter(name="autoscalingGroupName")
    def autoscaling_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Autoscaling Group to apply the tag to.
        """
        return pulumi.get(self, "autoscaling_group_name")

    @autoscaling_group_name.setter
    def autoscaling_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "autoscaling_group_name", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input['TagTagArgs']]:
        """
        Tag to create. The `tag` block is documented below.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input['TagTagArgs']]):
        pulumi.set(self, "tag", value)


class Tag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autoscaling_group_name: Optional[pulumi.Input[str]] = None,
                 tag: Optional[pulumi.Input[pulumi.InputType['TagTagArgs']]] = None,
                 __props__=None):
        """
        Manages an individual Autoscaling Group (ASG) tag. This resource should only be used in cases where ASGs are created outside the provider (e.g., ASGs implicitly created by EKS Node Groups).

        > **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `autoscaling.Group` and `autoscaling.Tag` to manage tags of the same ASG will cause a perpetual difference where the `autoscaling.Group` resource will try to remove the tag being added by the `autoscaling.Tag` resource.

        > **NOTE:** This tagging resource does not use the provider `ignore_tags` configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws


        def not_implemented(msg):
            raise NotImplementedError(msg)

        example = aws.eks.NodeGroup("example",
            cluster_name="example",
            node_group_name="example")
        example_tag = []
        for range in [{"value": i} for i in range(0, not_implemented(toset(
        [forasginflatten(
        [forresourcesinaws_eks_node_group.example.resources:resources.autoscaling_groups]
        ):asg.name]
        )))]:
            example_tag.append(aws.autoscaling.Tag(f"example-{range['value']}",
                autoscaling_group_name=range["value"],
                tag=aws.autoscaling.TagTagArgs(
                    key="k8s.io/cluster-autoscaler/node-template/label/eks.amazonaws.com/capacityType",
                    value="SPOT",
                    propagate_at_launch=False,
                )))
        ```

        ## Import

        Using `pulumi import`, import `aws_autoscaling_group_tag` using the ASG name and key, separated by a comma (`,`). For example:

        ```sh
         $ pulumi import aws:autoscaling/tag:Tag example asg-example,k8s.io/cluster-autoscaler/node-template/label/eks.amazonaws.com/capacityType
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] autoscaling_group_name: Name of the Autoscaling Group to apply the tag to.
        :param pulumi.Input[pulumi.InputType['TagTagArgs']] tag: Tag to create. The `tag` block is documented below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an individual Autoscaling Group (ASG) tag. This resource should only be used in cases where ASGs are created outside the provider (e.g., ASGs implicitly created by EKS Node Groups).

        > **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `autoscaling.Group` and `autoscaling.Tag` to manage tags of the same ASG will cause a perpetual difference where the `autoscaling.Group` resource will try to remove the tag being added by the `autoscaling.Tag` resource.

        > **NOTE:** This tagging resource does not use the provider `ignore_tags` configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws


        def not_implemented(msg):
            raise NotImplementedError(msg)

        example = aws.eks.NodeGroup("example",
            cluster_name="example",
            node_group_name="example")
        example_tag = []
        for range in [{"value": i} for i in range(0, not_implemented(toset(
        [forasginflatten(
        [forresourcesinaws_eks_node_group.example.resources:resources.autoscaling_groups]
        ):asg.name]
        )))]:
            example_tag.append(aws.autoscaling.Tag(f"example-{range['value']}",
                autoscaling_group_name=range["value"],
                tag=aws.autoscaling.TagTagArgs(
                    key="k8s.io/cluster-autoscaler/node-template/label/eks.amazonaws.com/capacityType",
                    value="SPOT",
                    propagate_at_launch=False,
                )))
        ```

        ## Import

        Using `pulumi import`, import `aws_autoscaling_group_tag` using the ASG name and key, separated by a comma (`,`). For example:

        ```sh
         $ pulumi import aws:autoscaling/tag:Tag example asg-example,k8s.io/cluster-autoscaler/node-template/label/eks.amazonaws.com/capacityType
        ```

        :param str resource_name: The name of the resource.
        :param TagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autoscaling_group_name: Optional[pulumi.Input[str]] = None,
                 tag: Optional[pulumi.Input[pulumi.InputType['TagTagArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TagArgs.__new__(TagArgs)

            if autoscaling_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'autoscaling_group_name'")
            __props__.__dict__["autoscaling_group_name"] = autoscaling_group_name
            if tag is None and not opts.urn:
                raise TypeError("Missing required property 'tag'")
            __props__.__dict__["tag"] = tag
        super(Tag, __self__).__init__(
            'aws:autoscaling/tag:Tag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            autoscaling_group_name: Optional[pulumi.Input[str]] = None,
            tag: Optional[pulumi.Input[pulumi.InputType['TagTagArgs']]] = None) -> 'Tag':
        """
        Get an existing Tag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] autoscaling_group_name: Name of the Autoscaling Group to apply the tag to.
        :param pulumi.Input[pulumi.InputType['TagTagArgs']] tag: Tag to create. The `tag` block is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TagState.__new__(_TagState)

        __props__.__dict__["autoscaling_group_name"] = autoscaling_group_name
        __props__.__dict__["tag"] = tag
        return Tag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoscalingGroupName")
    def autoscaling_group_name(self) -> pulumi.Output[str]:
        """
        Name of the Autoscaling Group to apply the tag to.
        """
        return pulumi.get(self, "autoscaling_group_name")

    @property
    @pulumi.getter
    def tag(self) -> pulumi.Output['outputs.TagTag']:
        """
        Tag to create. The `tag` block is documented below.
        """
        return pulumi.get(self, "tag")

