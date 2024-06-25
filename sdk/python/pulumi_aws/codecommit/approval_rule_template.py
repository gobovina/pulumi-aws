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

__all__ = ['ApprovalRuleTemplateArgs', 'ApprovalRuleTemplate']

@pulumi.input_type
class ApprovalRuleTemplateArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApprovalRuleTemplate resource.
        :param pulumi.Input[str] content: The content of the approval rule template. Maximum of 3000 characters.
        :param pulumi.Input[str] description: The description of the approval rule template. Maximum of 1000 characters.
        :param pulumi.Input[str] name: The name for the approval rule template. Maximum of 100 characters.
        """
        pulumi.set(__self__, "content", content)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        The content of the approval rule template. Maximum of 3000 characters.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the approval rule template. Maximum of 1000 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the approval rule template. Maximum of 100 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ApprovalRuleTemplateState:
    def __init__(__self__, *,
                 approval_rule_template_id: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 creation_date: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_modified_date: Optional[pulumi.Input[str]] = None,
                 last_modified_user: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rule_content_sha256: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApprovalRuleTemplate resources.
        :param pulumi.Input[str] approval_rule_template_id: The ID of the approval rule template
        :param pulumi.Input[str] content: The content of the approval rule template. Maximum of 3000 characters.
        :param pulumi.Input[str] creation_date: The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[str] description: The description of the approval rule template. Maximum of 1000 characters.
        :param pulumi.Input[str] last_modified_date: The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[str] last_modified_user: The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
        :param pulumi.Input[str] name: The name for the approval rule template. Maximum of 100 characters.
        :param pulumi.Input[str] rule_content_sha256: The SHA-256 hash signature for the content of the approval rule template.
        """
        if approval_rule_template_id is not None:
            pulumi.set(__self__, "approval_rule_template_id", approval_rule_template_id)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if creation_date is not None:
            pulumi.set(__self__, "creation_date", creation_date)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_modified_date is not None:
            pulumi.set(__self__, "last_modified_date", last_modified_date)
        if last_modified_user is not None:
            pulumi.set(__self__, "last_modified_user", last_modified_user)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rule_content_sha256 is not None:
            pulumi.set(__self__, "rule_content_sha256", rule_content_sha256)

    @property
    @pulumi.getter(name="approvalRuleTemplateId")
    def approval_rule_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the approval rule template
        """
        return pulumi.get(self, "approval_rule_template_id")

    @approval_rule_template_id.setter
    def approval_rule_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "approval_rule_template_id", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The content of the approval rule template. Maximum of 3000 characters.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "creation_date")

    @creation_date.setter
    def creation_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_date", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the approval rule template. Maximum of 1000 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastModifiedDate")
    def last_modified_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "last_modified_date")

    @last_modified_date.setter
    def last_modified_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified_date", value)

    @property
    @pulumi.getter(name="lastModifiedUser")
    def last_modified_user(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
        """
        return pulumi.get(self, "last_modified_user")

    @last_modified_user.setter
    def last_modified_user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified_user", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the approval rule template. Maximum of 100 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ruleContentSha256")
    def rule_content_sha256(self) -> Optional[pulumi.Input[str]]:
        """
        The SHA-256 hash signature for the content of the approval rule template.
        """
        return pulumi.get(self, "rule_content_sha256")

    @rule_content_sha256.setter
    def rule_content_sha256(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_content_sha256", value)


class ApprovalRuleTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CodeCommit Approval Rule Template Resource.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.codecommit.ApprovalRuleTemplate("example",
            name="MyExampleApprovalRuleTemplate",
            description="This is an example approval rule template",
            content=json.dumps({
                "Version": "2018-11-08",
                "DestinationReferences": ["refs/heads/master"],
                "Statements": [{
                    "Type": "Approvers",
                    "NumberOfApprovalsNeeded": 2,
                    "ApprovalPoolMembers": ["arn:aws:sts::123456789012:assumed-role/CodeCommitReview/*"],
                }],
            }))
        ```

        ## Import

        Using `pulumi import`, import CodeCommit approval rule templates using the `name`. For example:

        ```sh
        $ pulumi import aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate imported ExistingApprovalRuleTemplateName
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content: The content of the approval rule template. Maximum of 3000 characters.
        :param pulumi.Input[str] description: The description of the approval rule template. Maximum of 1000 characters.
        :param pulumi.Input[str] name: The name for the approval rule template. Maximum of 100 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApprovalRuleTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CodeCommit Approval Rule Template Resource.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.codecommit.ApprovalRuleTemplate("example",
            name="MyExampleApprovalRuleTemplate",
            description="This is an example approval rule template",
            content=json.dumps({
                "Version": "2018-11-08",
                "DestinationReferences": ["refs/heads/master"],
                "Statements": [{
                    "Type": "Approvers",
                    "NumberOfApprovalsNeeded": 2,
                    "ApprovalPoolMembers": ["arn:aws:sts::123456789012:assumed-role/CodeCommitReview/*"],
                }],
            }))
        ```

        ## Import

        Using `pulumi import`, import CodeCommit approval rule templates using the `name`. For example:

        ```sh
        $ pulumi import aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate imported ExistingApprovalRuleTemplateName
        ```

        :param str resource_name: The name of the resource.
        :param ApprovalRuleTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApprovalRuleTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApprovalRuleTemplateArgs.__new__(ApprovalRuleTemplateArgs)

            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["approval_rule_template_id"] = None
            __props__.__dict__["creation_date"] = None
            __props__.__dict__["last_modified_date"] = None
            __props__.__dict__["last_modified_user"] = None
            __props__.__dict__["rule_content_sha256"] = None
        super(ApprovalRuleTemplate, __self__).__init__(
            'aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            approval_rule_template_id: Optional[pulumi.Input[str]] = None,
            content: Optional[pulumi.Input[str]] = None,
            creation_date: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            last_modified_date: Optional[pulumi.Input[str]] = None,
            last_modified_user: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rule_content_sha256: Optional[pulumi.Input[str]] = None) -> 'ApprovalRuleTemplate':
        """
        Get an existing ApprovalRuleTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] approval_rule_template_id: The ID of the approval rule template
        :param pulumi.Input[str] content: The content of the approval rule template. Maximum of 3000 characters.
        :param pulumi.Input[str] creation_date: The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[str] description: The description of the approval rule template. Maximum of 1000 characters.
        :param pulumi.Input[str] last_modified_date: The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[str] last_modified_user: The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
        :param pulumi.Input[str] name: The name for the approval rule template. Maximum of 100 characters.
        :param pulumi.Input[str] rule_content_sha256: The SHA-256 hash signature for the content of the approval rule template.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApprovalRuleTemplateState.__new__(_ApprovalRuleTemplateState)

        __props__.__dict__["approval_rule_template_id"] = approval_rule_template_id
        __props__.__dict__["content"] = content
        __props__.__dict__["creation_date"] = creation_date
        __props__.__dict__["description"] = description
        __props__.__dict__["last_modified_date"] = last_modified_date
        __props__.__dict__["last_modified_user"] = last_modified_user
        __props__.__dict__["name"] = name
        __props__.__dict__["rule_content_sha256"] = rule_content_sha256
        return ApprovalRuleTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="approvalRuleTemplateId")
    def approval_rule_template_id(self) -> pulumi.Output[str]:
        """
        The ID of the approval rule template
        """
        return pulumi.get(self, "approval_rule_template_id")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        The content of the approval rule template. Maximum of 3000 characters.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> pulumi.Output[str]:
        """
        The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "creation_date")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the approval rule template. Maximum of 1000 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="lastModifiedDate")
    def last_modified_date(self) -> pulumi.Output[str]:
        """
        The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "last_modified_date")

    @property
    @pulumi.getter(name="lastModifiedUser")
    def last_modified_user(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
        """
        return pulumi.get(self, "last_modified_user")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the approval rule template. Maximum of 100 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ruleContentSha256")
    def rule_content_sha256(self) -> pulumi.Output[str]:
        """
        The SHA-256 hash signature for the content of the approval rule template.
        """
        return pulumi.get(self, "rule_content_sha256")

