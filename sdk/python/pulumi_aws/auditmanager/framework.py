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

__all__ = ['FrameworkArgs', 'Framework']

@pulumi.input_type
class FrameworkArgs:
    def __init__(__self__, *,
                 compliance_type: Optional[pulumi.Input[str]] = None,
                 control_sets: Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Framework resource.
        :param pulumi.Input[str] compliance_type: Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
        :param pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]] control_sets: Control sets that are associated with the framework. See `control_sets` below.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of the framework.
        :param pulumi.Input[str] name: Name of the framework.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if compliance_type is not None:
            pulumi.set(__self__, "compliance_type", compliance_type)
        if control_sets is not None:
            pulumi.set(__self__, "control_sets", control_sets)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="complianceType")
    def compliance_type(self) -> Optional[pulumi.Input[str]]:
        """
        Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
        """
        return pulumi.get(self, "compliance_type")

    @compliance_type.setter
    def compliance_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compliance_type", value)

    @property
    @pulumi.getter(name="controlSets")
    def control_sets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]]]:
        """
        Control sets that are associated with the framework. See `control_sets` below.

        The following arguments are optional:
        """
        return pulumi.get(self, "control_sets")

    @control_sets.setter
    def control_sets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]]]):
        pulumi.set(self, "control_sets", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the framework.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the framework.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _FrameworkState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 compliance_type: Optional[pulumi.Input[str]] = None,
                 control_sets: Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 framework_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Framework resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the framework.
               * `control_sets[*].id` - Unique identifier for the framework control set.
        :param pulumi.Input[str] compliance_type: Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
        :param pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]] control_sets: Control sets that are associated with the framework. See `control_sets` below.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of the framework.
        :param pulumi.Input[str] framework_type: Framework type, such as a custom framework or a standard framework.
        :param pulumi.Input[str] name: Name of the framework.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if compliance_type is not None:
            pulumi.set(__self__, "compliance_type", compliance_type)
        if control_sets is not None:
            pulumi.set(__self__, "control_sets", control_sets)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if framework_type is not None:
            pulumi.set(__self__, "framework_type", framework_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
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
        Amazon Resource Name (ARN) of the framework.
        * `control_sets[*].id` - Unique identifier for the framework control set.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="complianceType")
    def compliance_type(self) -> Optional[pulumi.Input[str]]:
        """
        Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
        """
        return pulumi.get(self, "compliance_type")

    @compliance_type.setter
    def compliance_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compliance_type", value)

    @property
    @pulumi.getter(name="controlSets")
    def control_sets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]]]:
        """
        Control sets that are associated with the framework. See `control_sets` below.

        The following arguments are optional:
        """
        return pulumi.get(self, "control_sets")

    @control_sets.setter
    def control_sets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FrameworkControlSetArgs']]]]):
        pulumi.set(self, "control_sets", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the framework.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="frameworkType")
    def framework_type(self) -> Optional[pulumi.Input[str]]:
        """
        Framework type, such as a custom framework or a standard framework.
        """
        return pulumi.get(self, "framework_type")

    @framework_type.setter
    def framework_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "framework_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the framework.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class Framework(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compliance_type: Optional[pulumi.Input[str]] = None,
                 control_sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FrameworkControlSetArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS Audit Manager Framework.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.auditmanager.Framework("test",
            name="example",
            control_sets=[aws.auditmanager.FrameworkControlSetArgs(
                name="example",
                controls=[aws.auditmanager.FrameworkControlSetControlArgs(
                    id=test_aws_auditmanager_control["id"],
                )],
            )])
        ```

        ## Import

        Using `pulumi import`, import Audit Manager Framework using the framework `id`. For example:

        ```sh
         $ pulumi import aws:auditmanager/framework:Framework example abc123-de45
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] compliance_type: Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FrameworkControlSetArgs']]]] control_sets: Control sets that are associated with the framework. See `control_sets` below.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of the framework.
        :param pulumi.Input[str] name: Name of the framework.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[FrameworkArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS Audit Manager Framework.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.auditmanager.Framework("test",
            name="example",
            control_sets=[aws.auditmanager.FrameworkControlSetArgs(
                name="example",
                controls=[aws.auditmanager.FrameworkControlSetControlArgs(
                    id=test_aws_auditmanager_control["id"],
                )],
            )])
        ```

        ## Import

        Using `pulumi import`, import Audit Manager Framework using the framework `id`. For example:

        ```sh
         $ pulumi import aws:auditmanager/framework:Framework example abc123-de45
        ```

        :param str resource_name: The name of the resource.
        :param FrameworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FrameworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compliance_type: Optional[pulumi.Input[str]] = None,
                 control_sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FrameworkControlSetArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FrameworkArgs.__new__(FrameworkArgs)

            __props__.__dict__["compliance_type"] = compliance_type
            __props__.__dict__["control_sets"] = control_sets
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["framework_type"] = None
            __props__.__dict__["tags_all"] = None
        super(Framework, __self__).__init__(
            'aws:auditmanager/framework:Framework',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            compliance_type: Optional[pulumi.Input[str]] = None,
            control_sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FrameworkControlSetArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            framework_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Framework':
        """
        Get an existing Framework resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the framework.
               * `control_sets[*].id` - Unique identifier for the framework control set.
        :param pulumi.Input[str] compliance_type: Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FrameworkControlSetArgs']]]] control_sets: Control sets that are associated with the framework. See `control_sets` below.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of the framework.
        :param pulumi.Input[str] framework_type: Framework type, such as a custom framework or a standard framework.
        :param pulumi.Input[str] name: Name of the framework.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FrameworkState.__new__(_FrameworkState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["compliance_type"] = compliance_type
        __props__.__dict__["control_sets"] = control_sets
        __props__.__dict__["description"] = description
        __props__.__dict__["framework_type"] = framework_type
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Framework(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the framework.
        * `control_sets[*].id` - Unique identifier for the framework control set.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="complianceType")
    def compliance_type(self) -> pulumi.Output[Optional[str]]:
        """
        Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
        """
        return pulumi.get(self, "compliance_type")

    @property
    @pulumi.getter(name="controlSets")
    def control_sets(self) -> pulumi.Output[Optional[Sequence['outputs.FrameworkControlSet']]]:
        """
        Control sets that are associated with the framework. See `control_sets` below.

        The following arguments are optional:
        """
        return pulumi.get(self, "control_sets")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the framework.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="frameworkType")
    def framework_type(self) -> pulumi.Output[str]:
        """
        Framework type, such as a custom framework or a standard framework.
        """
        return pulumi.get(self, "framework_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the framework.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the framework. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

