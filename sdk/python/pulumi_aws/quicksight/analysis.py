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

__all__ = ['AnalysisArgs', 'Analysis']

@pulumi.input_type
class AnalysisArgs:
    def __init__(__self__, *,
                 analysis_id: pulumi.Input[str],
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input['AnalysisParametersArgs']] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]]] = None,
                 recovery_window_in_days: Optional[pulumi.Input[int]] = None,
                 source_entity: Optional[pulumi.Input['AnalysisSourceEntityArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 theme_arn: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Analysis resource.
        :param pulumi.Input[str] analysis_id: Identifier for the analysis.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] name: Display name for the analysis.
               
               The following arguments are optional:
        :param pulumi.Input['AnalysisParametersArgs'] parameters: The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
        :param pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]] permissions: A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
        :param pulumi.Input[int] recovery_window_in_days: A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. Use `0` to force deletion without recovery. Minimum value of `7`. Maximum value of `30`. Default to `30`.
        :param pulumi.Input['AnalysisSourceEntityArgs'] source_entity: The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] theme_arn: The Amazon Resource Name (ARN) of the theme that is being used for this analysis. The theme ARN must exist in the same AWS account where you create the analysis.
        """
        pulumi.set(__self__, "analysis_id", analysis_id)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if recovery_window_in_days is not None:
            pulumi.set(__self__, "recovery_window_in_days", recovery_window_in_days)
        if source_entity is not None:
            pulumi.set(__self__, "source_entity", source_entity)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if theme_arn is not None:
            pulumi.set(__self__, "theme_arn", theme_arn)

    @property
    @pulumi.getter(name="analysisId")
    def analysis_id(self) -> pulumi.Input[str]:
        """
        Identifier for the analysis.
        """
        return pulumi.get(self, "analysis_id")

    @analysis_id.setter
    def analysis_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "analysis_id", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Display name for the analysis.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input['AnalysisParametersArgs']]:
        """
        The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input['AnalysisParametersArgs']]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]]]:
        """
        A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="recoveryWindowInDays")
    def recovery_window_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. Use `0` to force deletion without recovery. Minimum value of `7`. Maximum value of `30`. Default to `30`.
        """
        return pulumi.get(self, "recovery_window_in_days")

    @recovery_window_in_days.setter
    def recovery_window_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "recovery_window_in_days", value)

    @property
    @pulumi.getter(name="sourceEntity")
    def source_entity(self) -> Optional[pulumi.Input['AnalysisSourceEntityArgs']]:
        """
        The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
        """
        return pulumi.get(self, "source_entity")

    @source_entity.setter
    def source_entity(self, value: Optional[pulumi.Input['AnalysisSourceEntityArgs']]):
        pulumi.set(self, "source_entity", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="themeArn")
    def theme_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the theme that is being used for this analysis. The theme ARN must exist in the same AWS account where you create the analysis.
        """
        return pulumi.get(self, "theme_arn")

    @theme_arn.setter
    def theme_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "theme_arn", value)


@pulumi.input_type
class _AnalysisState:
    def __init__(__self__, *,
                 analysis_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 created_time: Optional[pulumi.Input[str]] = None,
                 last_published_time: Optional[pulumi.Input[str]] = None,
                 last_updated_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input['AnalysisParametersArgs']] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]]] = None,
                 recovery_window_in_days: Optional[pulumi.Input[int]] = None,
                 source_entity: Optional[pulumi.Input['AnalysisSourceEntityArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 theme_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Analysis resources.
        :param pulumi.Input[str] analysis_id: Identifier for the analysis.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the resource.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] created_time: The time that the analysis was created.
        :param pulumi.Input[str] last_updated_time: The time that the analysis was last updated.
        :param pulumi.Input[str] name: Display name for the analysis.
               
               The following arguments are optional:
        :param pulumi.Input['AnalysisParametersArgs'] parameters: The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
        :param pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]] permissions: A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
        :param pulumi.Input[int] recovery_window_in_days: A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. Use `0` to force deletion without recovery. Minimum value of `7`. Maximum value of `30`. Default to `30`.
        :param pulumi.Input['AnalysisSourceEntityArgs'] source_entity: The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
        :param pulumi.Input[str] status: The analysis creation status.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] theme_arn: The Amazon Resource Name (ARN) of the theme that is being used for this analysis. The theme ARN must exist in the same AWS account where you create the analysis.
        """
        if analysis_id is not None:
            pulumi.set(__self__, "analysis_id", analysis_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if created_time is not None:
            pulumi.set(__self__, "created_time", created_time)
        if last_published_time is not None:
            pulumi.set(__self__, "last_published_time", last_published_time)
        if last_updated_time is not None:
            pulumi.set(__self__, "last_updated_time", last_updated_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if recovery_window_in_days is not None:
            pulumi.set(__self__, "recovery_window_in_days", recovery_window_in_days)
        if source_entity is not None:
            pulumi.set(__self__, "source_entity", source_entity)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if theme_arn is not None:
            pulumi.set(__self__, "theme_arn", theme_arn)

    @property
    @pulumi.getter(name="analysisId")
    def analysis_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for the analysis.
        """
        return pulumi.get(self, "analysis_id")

    @analysis_id.setter
    def analysis_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "analysis_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the resource.
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
    @pulumi.getter(name="createdTime")
    def created_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time that the analysis was created.
        """
        return pulumi.get(self, "created_time")

    @created_time.setter
    def created_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_time", value)

    @property
    @pulumi.getter(name="lastPublishedTime")
    def last_published_time(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "last_published_time")

    @last_published_time.setter
    def last_published_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_published_time", value)

    @property
    @pulumi.getter(name="lastUpdatedTime")
    def last_updated_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time that the analysis was last updated.
        """
        return pulumi.get(self, "last_updated_time")

    @last_updated_time.setter
    def last_updated_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Display name for the analysis.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input['AnalysisParametersArgs']]:
        """
        The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input['AnalysisParametersArgs']]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]]]:
        """
        A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AnalysisPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="recoveryWindowInDays")
    def recovery_window_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. Use `0` to force deletion without recovery. Minimum value of `7`. Maximum value of `30`. Default to `30`.
        """
        return pulumi.get(self, "recovery_window_in_days")

    @recovery_window_in_days.setter
    def recovery_window_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "recovery_window_in_days", value)

    @property
    @pulumi.getter(name="sourceEntity")
    def source_entity(self) -> Optional[pulumi.Input['AnalysisSourceEntityArgs']]:
        """
        The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
        """
        return pulumi.get(self, "source_entity")

    @source_entity.setter
    def source_entity(self, value: Optional[pulumi.Input['AnalysisSourceEntityArgs']]):
        pulumi.set(self, "source_entity", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The analysis creation status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="themeArn")
    def theme_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the theme that is being used for this analysis. The theme ARN must exist in the same AWS account where you create the analysis.
        """
        return pulumi.get(self, "theme_arn")

    @theme_arn.setter
    def theme_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "theme_arn", value)


class Analysis(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 analysis_id: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[pulumi.InputType['AnalysisParametersArgs']]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnalysisPermissionArgs']]]]] = None,
                 recovery_window_in_days: Optional[pulumi.Input[int]] = None,
                 source_entity: Optional[pulumi.Input[pulumi.InputType['AnalysisSourceEntityArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 theme_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing a QuickSight Analysis.

        ## Example Usage

        ### From Source Template

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.quicksight.Analysis("example",
            analysis_id="example-id",
            name="example-name",
            source_entity=aws.quicksight.AnalysisSourceEntityArgs(
                source_template=aws.quicksight.AnalysisSourceEntitySourceTemplateArgs(
                    arn=source["arn"],
                    data_set_references=[aws.quicksight.AnalysisSourceEntitySourceTemplateDataSetReferenceArgs(
                        data_set_arn=dataset["arn"],
                        data_set_placeholder="1",
                    )],
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import a QuickSight Analysis using the AWS account ID and analysis ID separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:quicksight/analysis:Analysis example 123456789012,example-id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] analysis_id: Identifier for the analysis.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] name: Display name for the analysis.
               
               The following arguments are optional:
        :param pulumi.Input[pulumi.InputType['AnalysisParametersArgs']] parameters: The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnalysisPermissionArgs']]]] permissions: A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
        :param pulumi.Input[int] recovery_window_in_days: A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. Use `0` to force deletion without recovery. Minimum value of `7`. Maximum value of `30`. Default to `30`.
        :param pulumi.Input[pulumi.InputType['AnalysisSourceEntityArgs']] source_entity: The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] theme_arn: The Amazon Resource Name (ARN) of the theme that is being used for this analysis. The theme ARN must exist in the same AWS account where you create the analysis.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AnalysisArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing a QuickSight Analysis.

        ## Example Usage

        ### From Source Template

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.quicksight.Analysis("example",
            analysis_id="example-id",
            name="example-name",
            source_entity=aws.quicksight.AnalysisSourceEntityArgs(
                source_template=aws.quicksight.AnalysisSourceEntitySourceTemplateArgs(
                    arn=source["arn"],
                    data_set_references=[aws.quicksight.AnalysisSourceEntitySourceTemplateDataSetReferenceArgs(
                        data_set_arn=dataset["arn"],
                        data_set_placeholder="1",
                    )],
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import a QuickSight Analysis using the AWS account ID and analysis ID separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:quicksight/analysis:Analysis example 123456789012,example-id
        ```

        :param str resource_name: The name of the resource.
        :param AnalysisArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AnalysisArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 analysis_id: Optional[pulumi.Input[str]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[pulumi.InputType['AnalysisParametersArgs']]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnalysisPermissionArgs']]]]] = None,
                 recovery_window_in_days: Optional[pulumi.Input[int]] = None,
                 source_entity: Optional[pulumi.Input[pulumi.InputType['AnalysisSourceEntityArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 theme_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AnalysisArgs.__new__(AnalysisArgs)

            if analysis_id is None and not opts.urn:
                raise TypeError("Missing required property 'analysis_id'")
            __props__.__dict__["analysis_id"] = analysis_id
            __props__.__dict__["aws_account_id"] = aws_account_id
            __props__.__dict__["name"] = name
            __props__.__dict__["parameters"] = parameters
            __props__.__dict__["permissions"] = permissions
            __props__.__dict__["recovery_window_in_days"] = recovery_window_in_days
            __props__.__dict__["source_entity"] = source_entity
            __props__.__dict__["tags"] = tags
            __props__.__dict__["theme_arn"] = theme_arn
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_time"] = None
            __props__.__dict__["last_published_time"] = None
            __props__.__dict__["last_updated_time"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["tags_all"] = None
        super(Analysis, __self__).__init__(
            'aws:quicksight/analysis:Analysis',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            analysis_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            aws_account_id: Optional[pulumi.Input[str]] = None,
            created_time: Optional[pulumi.Input[str]] = None,
            last_published_time: Optional[pulumi.Input[str]] = None,
            last_updated_time: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[pulumi.InputType['AnalysisParametersArgs']]] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnalysisPermissionArgs']]]]] = None,
            recovery_window_in_days: Optional[pulumi.Input[int]] = None,
            source_entity: Optional[pulumi.Input[pulumi.InputType['AnalysisSourceEntityArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            theme_arn: Optional[pulumi.Input[str]] = None) -> 'Analysis':
        """
        Get an existing Analysis resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] analysis_id: Identifier for the analysis.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the resource.
        :param pulumi.Input[str] aws_account_id: AWS account ID.
        :param pulumi.Input[str] created_time: The time that the analysis was created.
        :param pulumi.Input[str] last_updated_time: The time that the analysis was last updated.
        :param pulumi.Input[str] name: Display name for the analysis.
               
               The following arguments are optional:
        :param pulumi.Input[pulumi.InputType['AnalysisParametersArgs']] parameters: The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AnalysisPermissionArgs']]]] permissions: A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
        :param pulumi.Input[int] recovery_window_in_days: A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. Use `0` to force deletion without recovery. Minimum value of `7`. Maximum value of `30`. Default to `30`.
        :param pulumi.Input[pulumi.InputType['AnalysisSourceEntityArgs']] source_entity: The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
        :param pulumi.Input[str] status: The analysis creation status.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] theme_arn: The Amazon Resource Name (ARN) of the theme that is being used for this analysis. The theme ARN must exist in the same AWS account where you create the analysis.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AnalysisState.__new__(_AnalysisState)

        __props__.__dict__["analysis_id"] = analysis_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["aws_account_id"] = aws_account_id
        __props__.__dict__["created_time"] = created_time
        __props__.__dict__["last_published_time"] = last_published_time
        __props__.__dict__["last_updated_time"] = last_updated_time
        __props__.__dict__["name"] = name
        __props__.__dict__["parameters"] = parameters
        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["recovery_window_in_days"] = recovery_window_in_days
        __props__.__dict__["source_entity"] = source_entity
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["theme_arn"] = theme_arn
        return Analysis(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="analysisId")
    def analysis_id(self) -> pulumi.Output[str]:
        """
        Identifier for the analysis.
        """
        return pulumi.get(self, "analysis_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the resource.
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
    @pulumi.getter(name="createdTime")
    def created_time(self) -> pulumi.Output[str]:
        """
        The time that the analysis was created.
        """
        return pulumi.get(self, "created_time")

    @property
    @pulumi.getter(name="lastPublishedTime")
    def last_published_time(self) -> pulumi.Output[str]:
        return pulumi.get(self, "last_published_time")

    @property
    @pulumi.getter(name="lastUpdatedTime")
    def last_updated_time(self) -> pulumi.Output[str]:
        """
        The time that the analysis was last updated.
        """
        return pulumi.get(self, "last_updated_time")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Display name for the analysis.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output['outputs.AnalysisParameters']:
        """
        The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Optional[Sequence['outputs.AnalysisPermission']]]:
        """
        A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="recoveryWindowInDays")
    def recovery_window_in_days(self) -> pulumi.Output[Optional[int]]:
        """
        A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. Use `0` to force deletion without recovery. Minimum value of `7`. Maximum value of `30`. Default to `30`.
        """
        return pulumi.get(self, "recovery_window_in_days")

    @property
    @pulumi.getter(name="sourceEntity")
    def source_entity(self) -> pulumi.Output[Optional['outputs.AnalysisSourceEntity']]:
        """
        The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
        """
        return pulumi.get(self, "source_entity")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The analysis creation status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="themeArn")
    def theme_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The Amazon Resource Name (ARN) of the theme that is being used for this analysis. The theme ARN must exist in the same AWS account where you create the analysis.
        """
        return pulumi.get(self, "theme_arn")

