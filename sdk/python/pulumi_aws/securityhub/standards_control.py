# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['StandardsControlArgs', 'StandardsControl']

@pulumi.input_type
class StandardsControlArgs:
    def __init__(__self__, *,
                 control_status: pulumi.Input[str],
                 standards_control_arn: pulumi.Input[str],
                 disabled_reason: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a StandardsControl resource.
        :param pulumi.Input[str] control_status: The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
        :param pulumi.Input[str] standards_control_arn: The standards control ARN. See the AWS documentation for how to list existing controls using [`get-enabled-standards`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/get-enabled-standards.html) and [`describe-standards-controls`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/describe-standards-controls.html).
        :param pulumi.Input[str] disabled_reason: A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
        """
        pulumi.set(__self__, "control_status", control_status)
        pulumi.set(__self__, "standards_control_arn", standards_control_arn)
        if disabled_reason is not None:
            pulumi.set(__self__, "disabled_reason", disabled_reason)

    @property
    @pulumi.getter(name="controlStatus")
    def control_status(self) -> pulumi.Input[str]:
        """
        The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
        """
        return pulumi.get(self, "control_status")

    @control_status.setter
    def control_status(self, value: pulumi.Input[str]):
        pulumi.set(self, "control_status", value)

    @property
    @pulumi.getter(name="standardsControlArn")
    def standards_control_arn(self) -> pulumi.Input[str]:
        """
        The standards control ARN. See the AWS documentation for how to list existing controls using [`get-enabled-standards`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/get-enabled-standards.html) and [`describe-standards-controls`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/describe-standards-controls.html).
        """
        return pulumi.get(self, "standards_control_arn")

    @standards_control_arn.setter
    def standards_control_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "standards_control_arn", value)

    @property
    @pulumi.getter(name="disabledReason")
    def disabled_reason(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
        """
        return pulumi.get(self, "disabled_reason")

    @disabled_reason.setter
    def disabled_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "disabled_reason", value)


@pulumi.input_type
class _StandardsControlState:
    def __init__(__self__, *,
                 control_id: Optional[pulumi.Input[str]] = None,
                 control_status: Optional[pulumi.Input[str]] = None,
                 control_status_updated_at: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disabled_reason: Optional[pulumi.Input[str]] = None,
                 related_requirements: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 remediation_url: Optional[pulumi.Input[str]] = None,
                 severity_rating: Optional[pulumi.Input[str]] = None,
                 standards_control_arn: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StandardsControl resources.
        :param pulumi.Input[str] control_id: The identifier of the security standard control.
        :param pulumi.Input[str] control_status: The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
        :param pulumi.Input[str] control_status_updated_at: The date and time that the status of the security standard control was most recently updated.
        :param pulumi.Input[str] description: The standard control longer description. Provides information about what the control is checking for.
        :param pulumi.Input[str] disabled_reason: A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] related_requirements: The list of requirements that are related to this control.
        :param pulumi.Input[str] remediation_url: A link to remediation information for the control in the Security Hub user documentation.
        :param pulumi.Input[str] severity_rating: The severity of findings generated from this security standard control.
        :param pulumi.Input[str] standards_control_arn: The standards control ARN. See the AWS documentation for how to list existing controls using [`get-enabled-standards`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/get-enabled-standards.html) and [`describe-standards-controls`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/describe-standards-controls.html).
        :param pulumi.Input[str] title: The standard control title.
        """
        if control_id is not None:
            pulumi.set(__self__, "control_id", control_id)
        if control_status is not None:
            pulumi.set(__self__, "control_status", control_status)
        if control_status_updated_at is not None:
            pulumi.set(__self__, "control_status_updated_at", control_status_updated_at)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disabled_reason is not None:
            pulumi.set(__self__, "disabled_reason", disabled_reason)
        if related_requirements is not None:
            pulumi.set(__self__, "related_requirements", related_requirements)
        if remediation_url is not None:
            pulumi.set(__self__, "remediation_url", remediation_url)
        if severity_rating is not None:
            pulumi.set(__self__, "severity_rating", severity_rating)
        if standards_control_arn is not None:
            pulumi.set(__self__, "standards_control_arn", standards_control_arn)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter(name="controlId")
    def control_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the security standard control.
        """
        return pulumi.get(self, "control_id")

    @control_id.setter
    def control_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "control_id", value)

    @property
    @pulumi.getter(name="controlStatus")
    def control_status(self) -> Optional[pulumi.Input[str]]:
        """
        The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
        """
        return pulumi.get(self, "control_status")

    @control_status.setter
    def control_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "control_status", value)

    @property
    @pulumi.getter(name="controlStatusUpdatedAt")
    def control_status_updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time that the status of the security standard control was most recently updated.
        """
        return pulumi.get(self, "control_status_updated_at")

    @control_status_updated_at.setter
    def control_status_updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "control_status_updated_at", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The standard control longer description. Provides information about what the control is checking for.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disabledReason")
    def disabled_reason(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
        """
        return pulumi.get(self, "disabled_reason")

    @disabled_reason.setter
    def disabled_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "disabled_reason", value)

    @property
    @pulumi.getter(name="relatedRequirements")
    def related_requirements(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of requirements that are related to this control.
        """
        return pulumi.get(self, "related_requirements")

    @related_requirements.setter
    def related_requirements(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "related_requirements", value)

    @property
    @pulumi.getter(name="remediationUrl")
    def remediation_url(self) -> Optional[pulumi.Input[str]]:
        """
        A link to remediation information for the control in the Security Hub user documentation.
        """
        return pulumi.get(self, "remediation_url")

    @remediation_url.setter
    def remediation_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remediation_url", value)

    @property
    @pulumi.getter(name="severityRating")
    def severity_rating(self) -> Optional[pulumi.Input[str]]:
        """
        The severity of findings generated from this security standard control.
        """
        return pulumi.get(self, "severity_rating")

    @severity_rating.setter
    def severity_rating(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "severity_rating", value)

    @property
    @pulumi.getter(name="standardsControlArn")
    def standards_control_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The standards control ARN. See the AWS documentation for how to list existing controls using [`get-enabled-standards`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/get-enabled-standards.html) and [`describe-standards-controls`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/describe-standards-controls.html).
        """
        return pulumi.get(self, "standards_control_arn")

    @standards_control_arn.setter
    def standards_control_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "standards_control_arn", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        The standard control title.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)


class StandardsControl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 control_status: Optional[pulumi.Input[str]] = None,
                 disabled_reason: Optional[pulumi.Input[str]] = None,
                 standards_control_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Disable/enable Security Hub standards control in the current region.

        The `securityhub.StandardsControl` behaves differently from normal resources, in that
        TODO does not _create_ this resource, but instead "adopts" it
        into management. When you _delete_ this resource configuration, TODO "abandons" resource as is and just removes it from the state.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securityhub.Account("example")
        cis_aws_foundations_benchmark = aws.securityhub.StandardsSubscription("cisAwsFoundationsBenchmark", standards_arn="arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0",
        opts=pulumi.ResourceOptions(depends_on=[example]))
        ensure_iam_password_policy_prevents_password_reuse = aws.securityhub.StandardsControl("ensureIamPasswordPolicyPreventsPasswordReuse",
            standards_control_arn="arn:aws:securityhub:us-east-1:111111111111:control/cis-aws-foundations-benchmark/v/1.2.0/1.10",
            control_status="DISABLED",
            disabled_reason="We handle password policies within Okta",
            opts=pulumi.ResourceOptions(depends_on=[cis_aws_foundations_benchmark]))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] control_status: The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
        :param pulumi.Input[str] disabled_reason: A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
        :param pulumi.Input[str] standards_control_arn: The standards control ARN. See the AWS documentation for how to list existing controls using [`get-enabled-standards`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/get-enabled-standards.html) and [`describe-standards-controls`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/describe-standards-controls.html).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StandardsControlArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Disable/enable Security Hub standards control in the current region.

        The `securityhub.StandardsControl` behaves differently from normal resources, in that
        TODO does not _create_ this resource, but instead "adopts" it
        into management. When you _delete_ this resource configuration, TODO "abandons" resource as is and just removes it from the state.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securityhub.Account("example")
        cis_aws_foundations_benchmark = aws.securityhub.StandardsSubscription("cisAwsFoundationsBenchmark", standards_arn="arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0",
        opts=pulumi.ResourceOptions(depends_on=[example]))
        ensure_iam_password_policy_prevents_password_reuse = aws.securityhub.StandardsControl("ensureIamPasswordPolicyPreventsPasswordReuse",
            standards_control_arn="arn:aws:securityhub:us-east-1:111111111111:control/cis-aws-foundations-benchmark/v/1.2.0/1.10",
            control_status="DISABLED",
            disabled_reason="We handle password policies within Okta",
            opts=pulumi.ResourceOptions(depends_on=[cis_aws_foundations_benchmark]))
        ```

        :param str resource_name: The name of the resource.
        :param StandardsControlArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StandardsControlArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 control_status: Optional[pulumi.Input[str]] = None,
                 disabled_reason: Optional[pulumi.Input[str]] = None,
                 standards_control_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StandardsControlArgs.__new__(StandardsControlArgs)

            if control_status is None and not opts.urn:
                raise TypeError("Missing required property 'control_status'")
            __props__.__dict__["control_status"] = control_status
            __props__.__dict__["disabled_reason"] = disabled_reason
            if standards_control_arn is None and not opts.urn:
                raise TypeError("Missing required property 'standards_control_arn'")
            __props__.__dict__["standards_control_arn"] = standards_control_arn
            __props__.__dict__["control_id"] = None
            __props__.__dict__["control_status_updated_at"] = None
            __props__.__dict__["description"] = None
            __props__.__dict__["related_requirements"] = None
            __props__.__dict__["remediation_url"] = None
            __props__.__dict__["severity_rating"] = None
            __props__.__dict__["title"] = None
        super(StandardsControl, __self__).__init__(
            'aws:securityhub/standardsControl:StandardsControl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            control_id: Optional[pulumi.Input[str]] = None,
            control_status: Optional[pulumi.Input[str]] = None,
            control_status_updated_at: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disabled_reason: Optional[pulumi.Input[str]] = None,
            related_requirements: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            remediation_url: Optional[pulumi.Input[str]] = None,
            severity_rating: Optional[pulumi.Input[str]] = None,
            standards_control_arn: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None) -> 'StandardsControl':
        """
        Get an existing StandardsControl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] control_id: The identifier of the security standard control.
        :param pulumi.Input[str] control_status: The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
        :param pulumi.Input[str] control_status_updated_at: The date and time that the status of the security standard control was most recently updated.
        :param pulumi.Input[str] description: The standard control longer description. Provides information about what the control is checking for.
        :param pulumi.Input[str] disabled_reason: A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] related_requirements: The list of requirements that are related to this control.
        :param pulumi.Input[str] remediation_url: A link to remediation information for the control in the Security Hub user documentation.
        :param pulumi.Input[str] severity_rating: The severity of findings generated from this security standard control.
        :param pulumi.Input[str] standards_control_arn: The standards control ARN. See the AWS documentation for how to list existing controls using [`get-enabled-standards`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/get-enabled-standards.html) and [`describe-standards-controls`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/describe-standards-controls.html).
        :param pulumi.Input[str] title: The standard control title.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StandardsControlState.__new__(_StandardsControlState)

        __props__.__dict__["control_id"] = control_id
        __props__.__dict__["control_status"] = control_status
        __props__.__dict__["control_status_updated_at"] = control_status_updated_at
        __props__.__dict__["description"] = description
        __props__.__dict__["disabled_reason"] = disabled_reason
        __props__.__dict__["related_requirements"] = related_requirements
        __props__.__dict__["remediation_url"] = remediation_url
        __props__.__dict__["severity_rating"] = severity_rating
        __props__.__dict__["standards_control_arn"] = standards_control_arn
        __props__.__dict__["title"] = title
        return StandardsControl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="controlId")
    def control_id(self) -> pulumi.Output[str]:
        """
        The identifier of the security standard control.
        """
        return pulumi.get(self, "control_id")

    @property
    @pulumi.getter(name="controlStatus")
    def control_status(self) -> pulumi.Output[str]:
        """
        The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
        """
        return pulumi.get(self, "control_status")

    @property
    @pulumi.getter(name="controlStatusUpdatedAt")
    def control_status_updated_at(self) -> pulumi.Output[str]:
        """
        The date and time that the status of the security standard control was most recently updated.
        """
        return pulumi.get(self, "control_status_updated_at")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The standard control longer description. Provides information about what the control is checking for.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="disabledReason")
    def disabled_reason(self) -> pulumi.Output[str]:
        """
        A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
        """
        return pulumi.get(self, "disabled_reason")

    @property
    @pulumi.getter(name="relatedRequirements")
    def related_requirements(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of requirements that are related to this control.
        """
        return pulumi.get(self, "related_requirements")

    @property
    @pulumi.getter(name="remediationUrl")
    def remediation_url(self) -> pulumi.Output[str]:
        """
        A link to remediation information for the control in the Security Hub user documentation.
        """
        return pulumi.get(self, "remediation_url")

    @property
    @pulumi.getter(name="severityRating")
    def severity_rating(self) -> pulumi.Output[str]:
        """
        The severity of findings generated from this security standard control.
        """
        return pulumi.get(self, "severity_rating")

    @property
    @pulumi.getter(name="standardsControlArn")
    def standards_control_arn(self) -> pulumi.Output[str]:
        """
        The standards control ARN. See the AWS documentation for how to list existing controls using [`get-enabled-standards`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/get-enabled-standards.html) and [`describe-standards-controls`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/securityhub/describe-standards-controls.html).
        """
        return pulumi.get(self, "standards_control_arn")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        The standard control title.
        """
        return pulumi.get(self, "title")

