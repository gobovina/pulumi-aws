# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TemplateAliasArgs', 'TemplateAlias']

@pulumi.input_type
class TemplateAliasArgs:
    def __init__(__self__, *,
                 alias_name: pulumi.Input[str],
                 template_id: pulumi.Input[str],
                 template_version_number: pulumi.Input[int],
                 aws_account_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TemplateAlias resource.
        :param pulumi.Input[str] alias_name: Display name of the template alias.
        :param pulumi.Input[str] template_id: ID of the template.
        :param pulumi.Input[int] template_version_number: Version number of the template.
               
               The following arguments are optional:
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        """
        pulumi.set(__self__, "alias_name", alias_name)
        pulumi.set(__self__, "template_id", template_id)
        pulumi.set(__self__, "template_version_number", template_version_number)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)

    @property
    @pulumi.getter(name="aliasName")
    def alias_name(self) -> pulumi.Input[str]:
        """
        Display name of the template alias.
        """
        return pulumi.get(self, "alias_name")

    @alias_name.setter
    def alias_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "alias_name", value)

    @property
    @pulumi.getter(name="templateId")
    def template_id(self) -> pulumi.Input[str]:
        """
        ID of the template.
        """
        return pulumi.get(self, "template_id")

    @template_id.setter
    def template_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "template_id", value)

    @property
    @pulumi.getter(name="templateVersionNumber")
    def template_version_number(self) -> pulumi.Input[int]:
        """
        Version number of the template.

        The following arguments are optional:
        """
        return pulumi.get(self, "template_version_number")

    @template_version_number.setter
    def template_version_number(self, value: pulumi.Input[int]):
        pulumi.set(self, "template_version_number", value)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_account_id", value)


@pulumi.input_type
class _TemplateAliasState:
    def __init__(__self__, *,
                 alias_name: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 template_id: Optional[pulumi.Input[str]] = None,
                 template_version_number: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering TemplateAlias resources.
        :param pulumi.Input[str] alias_name: Display name of the template alias.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the template alias.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] template_id: ID of the template.
        :param pulumi.Input[int] template_version_number: Version number of the template.
               
               The following arguments are optional:
        """
        if alias_name is not None:
            pulumi.set(__self__, "alias_name", alias_name)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if template_id is not None:
            pulumi.set(__self__, "template_id", template_id)
        if template_version_number is not None:
            pulumi.set(__self__, "template_version_number", template_version_number)

    @property
    @pulumi.getter(name="aliasName")
    def alias_name(self) -> Optional[pulumi.Input[str]]:
        """
        Display name of the template alias.
        """
        return pulumi.get(self, "alias_name")

    @alias_name.setter
    def alias_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alias_name", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the template alias.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="templateId")
    def template_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the template.
        """
        return pulumi.get(self, "template_id")

    @template_id.setter
    def template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_id", value)

    @property
    @pulumi.getter(name="templateVersionNumber")
    def template_version_number(self) -> Optional[pulumi.Input[int]]:
        """
        Version number of the template.

        The following arguments are optional:
        """
        return pulumi.get(self, "template_version_number")

    @template_version_number.setter
    def template_version_number(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "template_version_number", value)


class TemplateAlias(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias_name: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 template_id: Optional[pulumi.Input[str]] = None,
                 template_version_number: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Resource for managing an AWS QuickSight Template Alias.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.quicksight.TemplateAlias("example",
            alias_name="example-alias",
            template_id=test["templateId"],
            template_version_number=test["versionNumber"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import QuickSight Template Alias using the AWS account ID, template ID, and alias name separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:quicksight/templateAlias:TemplateAlias example 123456789012,example-id,example-alias
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alias_name: Display name of the template alias.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] template_id: ID of the template.
        :param pulumi.Input[int] template_version_number: Version number of the template.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TemplateAliasArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS QuickSight Template Alias.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.quicksight.TemplateAlias("example",
            alias_name="example-alias",
            template_id=test["templateId"],
            template_version_number=test["versionNumber"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import QuickSight Template Alias using the AWS account ID, template ID, and alias name separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:quicksight/templateAlias:TemplateAlias example 123456789012,example-id,example-alias
        ```

        :param str resource_name: The name of the resource.
        :param TemplateAliasArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TemplateAliasArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias_name: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 template_id: Optional[pulumi.Input[str]] = None,
                 template_version_number: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TemplateAliasArgs.__new__(TemplateAliasArgs)

            if alias_name is None and not opts.urn:
                raise TypeError("Missing required property 'alias_name'")
            __props__.__dict__["alias_name"] = alias_name
            __props__.__dict__["aws_account_id"] = aws_account_id
            if template_id is None and not opts.urn:
                raise TypeError("Missing required property 'template_id'")
            __props__.__dict__["template_id"] = template_id
            if template_version_number is None and not opts.urn:
                raise TypeError("Missing required property 'template_version_number'")
            __props__.__dict__["template_version_number"] = template_version_number
            __props__.__dict__["arn"] = None
        super(TemplateAlias, __self__).__init__(
            'aws:quicksight/templateAlias:TemplateAlias',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alias_name: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            aws_account_id: Optional[pulumi.Input[str]] = None,
            template_id: Optional[pulumi.Input[str]] = None,
            template_version_number: Optional[pulumi.Input[int]] = None) -> 'TemplateAlias':
        """
        Get an existing TemplateAlias resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alias_name: Display name of the template alias.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the template alias.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] template_id: ID of the template.
        :param pulumi.Input[int] template_version_number: Version number of the template.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TemplateAliasState.__new__(_TemplateAliasState)

        __props__.__dict__["alias_name"] = alias_name
        __props__.__dict__["arn"] = arn
        __props__.__dict__["aws_account_id"] = aws_account_id
        __props__.__dict__["template_id"] = template_id
        __props__.__dict__["template_version_number"] = template_version_number
        return TemplateAlias(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aliasName")
    def alias_name(self) -> pulumi.Output[str]:
        """
        Display name of the template alias.
        """
        return pulumi.get(self, "alias_name")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the template alias.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Output[str]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="templateId")
    def template_id(self) -> pulumi.Output[str]:
        """
        ID of the template.
        """
        return pulumi.get(self, "template_id")

    @property
    @pulumi.getter(name="templateVersionNumber")
    def template_version_number(self) -> pulumi.Output[int]:
        """
        Version number of the template.

        The following arguments are optional:
        """
        return pulumi.get(self, "template_version_number")

