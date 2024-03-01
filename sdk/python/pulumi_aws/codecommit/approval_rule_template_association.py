# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ApprovalRuleTemplateAssociationArgs', 'ApprovalRuleTemplateAssociation']

@pulumi.input_type
class ApprovalRuleTemplateAssociationArgs:
    def __init__(__self__, *,
                 approval_rule_template_name: pulumi.Input[str],
                 repository_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a ApprovalRuleTemplateAssociation resource.
        :param pulumi.Input[str] approval_rule_template_name: The name for the approval rule template.
        :param pulumi.Input[str] repository_name: The name of the repository that you want to associate with the template.
        """
        pulumi.set(__self__, "approval_rule_template_name", approval_rule_template_name)
        pulumi.set(__self__, "repository_name", repository_name)

    @property
    @pulumi.getter(name="approvalRuleTemplateName")
    def approval_rule_template_name(self) -> pulumi.Input[str]:
        """
        The name for the approval rule template.
        """
        return pulumi.get(self, "approval_rule_template_name")

    @approval_rule_template_name.setter
    def approval_rule_template_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "approval_rule_template_name", value)

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> pulumi.Input[str]:
        """
        The name of the repository that you want to associate with the template.
        """
        return pulumi.get(self, "repository_name")

    @repository_name.setter
    def repository_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository_name", value)


@pulumi.input_type
class _ApprovalRuleTemplateAssociationState:
    def __init__(__self__, *,
                 approval_rule_template_name: Optional[pulumi.Input[str]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApprovalRuleTemplateAssociation resources.
        :param pulumi.Input[str] approval_rule_template_name: The name for the approval rule template.
        :param pulumi.Input[str] repository_name: The name of the repository that you want to associate with the template.
        """
        if approval_rule_template_name is not None:
            pulumi.set(__self__, "approval_rule_template_name", approval_rule_template_name)
        if repository_name is not None:
            pulumi.set(__self__, "repository_name", repository_name)

    @property
    @pulumi.getter(name="approvalRuleTemplateName")
    def approval_rule_template_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the approval rule template.
        """
        return pulumi.get(self, "approval_rule_template_name")

    @approval_rule_template_name.setter
    def approval_rule_template_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "approval_rule_template_name", value)

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the repository that you want to associate with the template.
        """
        return pulumi.get(self, "repository_name")

    @repository_name.setter
    def repository_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository_name", value)


class ApprovalRuleTemplateAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 approval_rule_template_name: Optional[pulumi.Input[str]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Associates a CodeCommit Approval Rule Template with a Repository.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codecommit.ApprovalRuleTemplateAssociation("example",
            approval_rule_template_name=example_aws_codecommit_approval_rule_template["name"],
            repository_name=example_aws_codecommit_repository["repositoryName"])
        ```

        ## Import

        Using `pulumi import`, import CodeCommit approval rule template associations using the `approval_rule_template_name` and `repository_name` separated by a comma (`,`). For example:

        ```sh
         $ pulumi import aws:codecommit/approvalRuleTemplateAssociation:ApprovalRuleTemplateAssociation example approver-rule-for-example,MyExampleRepo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] approval_rule_template_name: The name for the approval rule template.
        :param pulumi.Input[str] repository_name: The name of the repository that you want to associate with the template.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApprovalRuleTemplateAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Associates a CodeCommit Approval Rule Template with a Repository.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codecommit.ApprovalRuleTemplateAssociation("example",
            approval_rule_template_name=example_aws_codecommit_approval_rule_template["name"],
            repository_name=example_aws_codecommit_repository["repositoryName"])
        ```

        ## Import

        Using `pulumi import`, import CodeCommit approval rule template associations using the `approval_rule_template_name` and `repository_name` separated by a comma (`,`). For example:

        ```sh
         $ pulumi import aws:codecommit/approvalRuleTemplateAssociation:ApprovalRuleTemplateAssociation example approver-rule-for-example,MyExampleRepo
        ```

        :param str resource_name: The name of the resource.
        :param ApprovalRuleTemplateAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApprovalRuleTemplateAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 approval_rule_template_name: Optional[pulumi.Input[str]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApprovalRuleTemplateAssociationArgs.__new__(ApprovalRuleTemplateAssociationArgs)

            if approval_rule_template_name is None and not opts.urn:
                raise TypeError("Missing required property 'approval_rule_template_name'")
            __props__.__dict__["approval_rule_template_name"] = approval_rule_template_name
            if repository_name is None and not opts.urn:
                raise TypeError("Missing required property 'repository_name'")
            __props__.__dict__["repository_name"] = repository_name
        super(ApprovalRuleTemplateAssociation, __self__).__init__(
            'aws:codecommit/approvalRuleTemplateAssociation:ApprovalRuleTemplateAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            approval_rule_template_name: Optional[pulumi.Input[str]] = None,
            repository_name: Optional[pulumi.Input[str]] = None) -> 'ApprovalRuleTemplateAssociation':
        """
        Get an existing ApprovalRuleTemplateAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] approval_rule_template_name: The name for the approval rule template.
        :param pulumi.Input[str] repository_name: The name of the repository that you want to associate with the template.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApprovalRuleTemplateAssociationState.__new__(_ApprovalRuleTemplateAssociationState)

        __props__.__dict__["approval_rule_template_name"] = approval_rule_template_name
        __props__.__dict__["repository_name"] = repository_name
        return ApprovalRuleTemplateAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="approvalRuleTemplateName")
    def approval_rule_template_name(self) -> pulumi.Output[str]:
        """
        The name for the approval rule template.
        """
        return pulumi.get(self, "approval_rule_template_name")

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> pulumi.Output[str]:
        """
        The name of the repository that you want to associate with the template.
        """
        return pulumi.get(self, "repository_name")

