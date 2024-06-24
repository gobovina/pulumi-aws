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

__all__ = ['AssessmentArgs', 'Assessment']

@pulumi.input_type
class AssessmentArgs:
    def __init__(__self__, *,
                 framework_id: pulumi.Input[str],
                 roles: pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]],
                 assessment_reports_destination: Optional[pulumi.Input['AssessmentAssessmentReportsDestinationArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scope: Optional[pulumi.Input['AssessmentScopeArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Assessment resource.
        :param pulumi.Input[str] framework_id: Unique identifier of the framework the assessment will be created from.
        :param pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]] roles: List of roles for the assessment. See `roles` below.
        :param pulumi.Input['AssessmentAssessmentReportsDestinationArgs'] assessment_reports_destination: Assessment report storage destination configuration. See `assessment_reports_destination` below.
        :param pulumi.Input[str] description: Description of the assessment.
        :param pulumi.Input[str] name: Name of the assessment.
        :param pulumi.Input['AssessmentScopeArgs'] scope: Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "framework_id", framework_id)
        pulumi.set(__self__, "roles", roles)
        if assessment_reports_destination is not None:
            pulumi.set(__self__, "assessment_reports_destination", assessment_reports_destination)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="frameworkId")
    def framework_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the framework the assessment will be created from.
        """
        return pulumi.get(self, "framework_id")

    @framework_id.setter
    def framework_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "framework_id", value)

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]]:
        """
        List of roles for the assessment. See `roles` below.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="assessmentReportsDestination")
    def assessment_reports_destination(self) -> Optional[pulumi.Input['AssessmentAssessmentReportsDestinationArgs']]:
        """
        Assessment report storage destination configuration. See `assessment_reports_destination` below.
        """
        return pulumi.get(self, "assessment_reports_destination")

    @assessment_reports_destination.setter
    def assessment_reports_destination(self, value: Optional[pulumi.Input['AssessmentAssessmentReportsDestinationArgs']]):
        pulumi.set(self, "assessment_reports_destination", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the assessment.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the assessment.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input['AssessmentScopeArgs']]:
        """
        Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.

        The following arguments are optional:
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input['AssessmentScopeArgs']]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _AssessmentState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 assessment_reports_destination: Optional[pulumi.Input['AssessmentAssessmentReportsDestinationArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 framework_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]]] = None,
                 roles_alls: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentRolesAllArgs']]]] = None,
                 scope: Optional[pulumi.Input['AssessmentScopeArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Assessment resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the assessment.
        :param pulumi.Input['AssessmentAssessmentReportsDestinationArgs'] assessment_reports_destination: Assessment report storage destination configuration. See `assessment_reports_destination` below.
        :param pulumi.Input[str] description: Description of the assessment.
        :param pulumi.Input[str] framework_id: Unique identifier of the framework the assessment will be created from.
        :param pulumi.Input[str] name: Name of the assessment.
        :param pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]] roles: List of roles for the assessment. See `roles` below.
        :param pulumi.Input[Sequence[pulumi.Input['AssessmentRolesAllArgs']]] roles_alls: Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
        :param pulumi.Input['AssessmentScopeArgs'] scope: Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
               
               The following arguments are optional:
        :param pulumi.Input[str] status: Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if assessment_reports_destination is not None:
            pulumi.set(__self__, "assessment_reports_destination", assessment_reports_destination)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if framework_id is not None:
            pulumi.set(__self__, "framework_id", framework_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if roles_alls is not None:
            pulumi.set(__self__, "roles_alls", roles_alls)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if status is not None:
            pulumi.set(__self__, "status", status)
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
        Amazon Resource Name (ARN) of the assessment.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="assessmentReportsDestination")
    def assessment_reports_destination(self) -> Optional[pulumi.Input['AssessmentAssessmentReportsDestinationArgs']]:
        """
        Assessment report storage destination configuration. See `assessment_reports_destination` below.
        """
        return pulumi.get(self, "assessment_reports_destination")

    @assessment_reports_destination.setter
    def assessment_reports_destination(self, value: Optional[pulumi.Input['AssessmentAssessmentReportsDestinationArgs']]):
        pulumi.set(self, "assessment_reports_destination", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the assessment.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="frameworkId")
    def framework_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the framework the assessment will be created from.
        """
        return pulumi.get(self, "framework_id")

    @framework_id.setter
    def framework_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "framework_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the assessment.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]]]:
        """
        List of roles for the assessment. See `roles` below.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentRoleArgs']]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="rolesAlls")
    def roles_alls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentRolesAllArgs']]]]:
        """
        Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
        """
        return pulumi.get(self, "roles_alls")

    @roles_alls.setter
    def roles_alls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AssessmentRolesAllArgs']]]]):
        pulumi.set(self, "roles_alls", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input['AssessmentScopeArgs']]:
        """
        Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.

        The following arguments are optional:
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input['AssessmentScopeArgs']]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Assessment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assessment_reports_destination: Optional[pulumi.Input[pulumi.InputType['AssessmentAssessmentReportsDestinationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 framework_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssessmentRoleArgs']]]]] = None,
                 scope: Optional[pulumi.Input[pulumi.InputType['AssessmentScopeArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS Audit Manager Assessment.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.auditmanager.Assessment("test",
            name="example",
            assessment_reports_destination=aws.auditmanager.AssessmentAssessmentReportsDestinationArgs(
                destination=f"s3://{test_aws_s3_bucket['id']}",
                destination_type="S3",
            ),
            framework_id=test_aws_auditmanager_framework["id"],
            roles=[aws.auditmanager.AssessmentRoleArgs(
                role_arn=test_aws_iam_role["arn"],
                role_type="PROCESS_OWNER",
            )],
            scope=aws.auditmanager.AssessmentScopeArgs(
                aws_accounts=[aws.auditmanager.AssessmentScopeAwsAccountArgs(
                    id=current["accountId"],
                )],
                aws_services=[aws.auditmanager.AssessmentScopeAwsServiceArgs(
                    service_name="S3",
                )],
            ))
        ```

        ## Import

        Using `pulumi import`, import Audit Manager Assessments using the assessment `id`. For example:

        ```sh
        $ pulumi import aws:auditmanager/assessment:Assessment example abc123-de45
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AssessmentAssessmentReportsDestinationArgs']] assessment_reports_destination: Assessment report storage destination configuration. See `assessment_reports_destination` below.
        :param pulumi.Input[str] description: Description of the assessment.
        :param pulumi.Input[str] framework_id: Unique identifier of the framework the assessment will be created from.
        :param pulumi.Input[str] name: Name of the assessment.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssessmentRoleArgs']]]] roles: List of roles for the assessment. See `roles` below.
        :param pulumi.Input[pulumi.InputType['AssessmentScopeArgs']] scope: Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AssessmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS Audit Manager Assessment.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.auditmanager.Assessment("test",
            name="example",
            assessment_reports_destination=aws.auditmanager.AssessmentAssessmentReportsDestinationArgs(
                destination=f"s3://{test_aws_s3_bucket['id']}",
                destination_type="S3",
            ),
            framework_id=test_aws_auditmanager_framework["id"],
            roles=[aws.auditmanager.AssessmentRoleArgs(
                role_arn=test_aws_iam_role["arn"],
                role_type="PROCESS_OWNER",
            )],
            scope=aws.auditmanager.AssessmentScopeArgs(
                aws_accounts=[aws.auditmanager.AssessmentScopeAwsAccountArgs(
                    id=current["accountId"],
                )],
                aws_services=[aws.auditmanager.AssessmentScopeAwsServiceArgs(
                    service_name="S3",
                )],
            ))
        ```

        ## Import

        Using `pulumi import`, import Audit Manager Assessments using the assessment `id`. For example:

        ```sh
        $ pulumi import aws:auditmanager/assessment:Assessment example abc123-de45
        ```

        :param str resource_name: The name of the resource.
        :param AssessmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AssessmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assessment_reports_destination: Optional[pulumi.Input[pulumi.InputType['AssessmentAssessmentReportsDestinationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 framework_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssessmentRoleArgs']]]]] = None,
                 scope: Optional[pulumi.Input[pulumi.InputType['AssessmentScopeArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AssessmentArgs.__new__(AssessmentArgs)

            __props__.__dict__["assessment_reports_destination"] = assessment_reports_destination
            __props__.__dict__["description"] = description
            if framework_id is None and not opts.urn:
                raise TypeError("Missing required property 'framework_id'")
            __props__.__dict__["framework_id"] = framework_id
            __props__.__dict__["name"] = name
            if roles is None and not opts.urn:
                raise TypeError("Missing required property 'roles'")
            __props__.__dict__["roles"] = roles
            __props__.__dict__["scope"] = scope
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["roles_alls"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["tags_all"] = None
        super(Assessment, __self__).__init__(
            'aws:auditmanager/assessment:Assessment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            assessment_reports_destination: Optional[pulumi.Input[pulumi.InputType['AssessmentAssessmentReportsDestinationArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            framework_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssessmentRoleArgs']]]]] = None,
            roles_alls: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssessmentRolesAllArgs']]]]] = None,
            scope: Optional[pulumi.Input[pulumi.InputType['AssessmentScopeArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Assessment':
        """
        Get an existing Assessment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the assessment.
        :param pulumi.Input[pulumi.InputType['AssessmentAssessmentReportsDestinationArgs']] assessment_reports_destination: Assessment report storage destination configuration. See `assessment_reports_destination` below.
        :param pulumi.Input[str] description: Description of the assessment.
        :param pulumi.Input[str] framework_id: Unique identifier of the framework the assessment will be created from.
        :param pulumi.Input[str] name: Name of the assessment.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssessmentRoleArgs']]]] roles: List of roles for the assessment. See `roles` below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AssessmentRolesAllArgs']]]] roles_alls: Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
        :param pulumi.Input[pulumi.InputType['AssessmentScopeArgs']] scope: Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
               
               The following arguments are optional:
        :param pulumi.Input[str] status: Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AssessmentState.__new__(_AssessmentState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["assessment_reports_destination"] = assessment_reports_destination
        __props__.__dict__["description"] = description
        __props__.__dict__["framework_id"] = framework_id
        __props__.__dict__["name"] = name
        __props__.__dict__["roles"] = roles
        __props__.__dict__["roles_alls"] = roles_alls
        __props__.__dict__["scope"] = scope
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Assessment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the assessment.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="assessmentReportsDestination")
    def assessment_reports_destination(self) -> pulumi.Output[Optional['outputs.AssessmentAssessmentReportsDestination']]:
        """
        Assessment report storage destination configuration. See `assessment_reports_destination` below.
        """
        return pulumi.get(self, "assessment_reports_destination")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the assessment.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="frameworkId")
    def framework_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the framework the assessment will be created from.
        """
        return pulumi.get(self, "framework_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the assessment.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Sequence['outputs.AssessmentRole']]:
        """
        List of roles for the assessment. See `roles` below.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="rolesAlls")
    def roles_alls(self) -> pulumi.Output[Sequence['outputs.AssessmentRolesAll']]:
        """
        Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
        """
        return pulumi.get(self, "roles_alls")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional['outputs.AssessmentScope']]:
        """
        Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.

        The following arguments are optional:
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

