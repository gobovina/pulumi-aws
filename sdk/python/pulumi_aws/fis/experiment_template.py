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

__all__ = ['ExperimentTemplateArgs', 'ExperimentTemplate']

@pulumi.input_type
class ExperimentTemplateArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]],
                 description: pulumi.Input[str],
                 role_arn: pulumi.Input[str],
                 stop_conditions: pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]],
                 log_configuration: Optional[pulumi.Input['ExperimentTemplateLogConfigurationArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]]] = None):
        """
        The set of arguments for constructing a ExperimentTemplate resource.
        :param pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]] actions: Action to be performed during an experiment. See below.
        :param pulumi.Input[str] description: Description for the experiment template.
        :param pulumi.Input[str] role_arn: ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
        :param pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]] stop_conditions: When an ongoing experiment should be stopped. See below.
               
               The following arguments are optional:
        :param pulumi.Input['ExperimentTemplateLogConfigurationArgs'] log_configuration: The configuration for experiment logging. See below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]] targets: Target of an action. See below.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "stop_conditions", stop_conditions)
        if log_configuration is not None:
            pulumi.set(__self__, "log_configuration", log_configuration)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if targets is not None:
            pulumi.set(__self__, "targets", targets)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]]:
        """
        Action to be performed during an experiment. See below.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description for the experiment template.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        """
        ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="stopConditions")
    def stop_conditions(self) -> pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]]:
        """
        When an ongoing experiment should be stopped. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "stop_conditions")

    @stop_conditions.setter
    def stop_conditions(self, value: pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]]):
        pulumi.set(self, "stop_conditions", value)

    @property
    @pulumi.getter(name="logConfiguration")
    def log_configuration(self) -> Optional[pulumi.Input['ExperimentTemplateLogConfigurationArgs']]:
        """
        The configuration for experiment logging. See below.
        """
        return pulumi.get(self, "log_configuration")

    @log_configuration.setter
    def log_configuration(self, value: Optional[pulumi.Input['ExperimentTemplateLogConfigurationArgs']]):
        pulumi.set(self, "log_configuration", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]]]:
        """
        Target of an action. See below.
        """
        return pulumi.get(self, "targets")

    @targets.setter
    def targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]]]):
        pulumi.set(self, "targets", value)


@pulumi.input_type
class _ExperimentTemplateState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 log_configuration: Optional[pulumi.Input['ExperimentTemplateLogConfigurationArgs']] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 stop_conditions: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]]] = None):
        """
        Input properties used for looking up and filtering ExperimentTemplate resources.
        :param pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]] actions: Action to be performed during an experiment. See below.
        :param pulumi.Input[str] description: Description for the experiment template.
        :param pulumi.Input['ExperimentTemplateLogConfigurationArgs'] log_configuration: The configuration for experiment logging. See below.
        :param pulumi.Input[str] role_arn: ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
        :param pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]] stop_conditions: When an ongoing experiment should be stopped. See below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]] targets: Target of an action. See below.
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if log_configuration is not None:
            pulumi.set(__self__, "log_configuration", log_configuration)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)
        if stop_conditions is not None:
            pulumi.set(__self__, "stop_conditions", stop_conditions)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if targets is not None:
            pulumi.set(__self__, "targets", targets)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]]]:
        """
        Action to be performed during an experiment. See below.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description for the experiment template.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="logConfiguration")
    def log_configuration(self) -> Optional[pulumi.Input['ExperimentTemplateLogConfigurationArgs']]:
        """
        The configuration for experiment logging. See below.
        """
        return pulumi.get(self, "log_configuration")

    @log_configuration.setter
    def log_configuration(self, value: Optional[pulumi.Input['ExperimentTemplateLogConfigurationArgs']]):
        pulumi.set(self, "log_configuration", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="stopConditions")
    def stop_conditions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]]]:
        """
        When an ongoing experiment should be stopped. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "stop_conditions")

    @stop_conditions.setter
    def stop_conditions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateStopConditionArgs']]]]):
        pulumi.set(self, "stop_conditions", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter
    def targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]]]:
        """
        Target of an action. See below.
        """
        return pulumi.get(self, "targets")

    @targets.setter
    def targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ExperimentTemplateTargetArgs']]]]):
        pulumi.set(self, "targets", value)


class ExperimentTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateActionArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 log_configuration: Optional[pulumi.Input[pulumi.InputType['ExperimentTemplateLogConfigurationArgs']]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 stop_conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateStopConditionArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateTargetArgs']]]]] = None,
                 __props__=None):
        """
        Provides an FIS Experiment Template, which can be used to run an experiment.
        An experiment template contains one or more actions to run on specified targets during an experiment.
        It also contains the stop conditions that prevent the experiment from going out of bounds.
        See [Amazon Fault Injection Simulator](https://docs.aws.amazon.com/fis/index.html)
        for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.fis.ExperimentTemplate("example",
            description="example",
            role_arn=example_aws_iam_role["arn"],
            stop_conditions=[aws.fis.ExperimentTemplateStopConditionArgs(
                source="none",
            )],
            actions=[aws.fis.ExperimentTemplateActionArgs(
                name="example-action",
                action_id="aws:ec2:terminate-instances",
                target=aws.fis.ExperimentTemplateActionTargetArgs(
                    key="Instances",
                    value="example-target",
                ),
            )],
            targets=[aws.fis.ExperimentTemplateTargetArgs(
                name="example-target",
                resource_type="aws:ec2:instance",
                selection_mode="COUNT(1)",
                resource_tags=[aws.fis.ExperimentTemplateTargetResourceTagArgs(
                    key="env",
                    value="example",
                )],
            )])
        ```

        ## Import

        Using `pulumi import`, import FIS Experiment Templates using the `id`. For example:

        ```sh
         $ pulumi import aws:fis/experimentTemplate:ExperimentTemplate template EXT123AbCdEfGhIjK
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateActionArgs']]]] actions: Action to be performed during an experiment. See below.
        :param pulumi.Input[str] description: Description for the experiment template.
        :param pulumi.Input[pulumi.InputType['ExperimentTemplateLogConfigurationArgs']] log_configuration: The configuration for experiment logging. See below.
        :param pulumi.Input[str] role_arn: ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateStopConditionArgs']]]] stop_conditions: When an ongoing experiment should be stopped. See below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateTargetArgs']]]] targets: Target of an action. See below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ExperimentTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an FIS Experiment Template, which can be used to run an experiment.
        An experiment template contains one or more actions to run on specified targets during an experiment.
        It also contains the stop conditions that prevent the experiment from going out of bounds.
        See [Amazon Fault Injection Simulator](https://docs.aws.amazon.com/fis/index.html)
        for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.fis.ExperimentTemplate("example",
            description="example",
            role_arn=example_aws_iam_role["arn"],
            stop_conditions=[aws.fis.ExperimentTemplateStopConditionArgs(
                source="none",
            )],
            actions=[aws.fis.ExperimentTemplateActionArgs(
                name="example-action",
                action_id="aws:ec2:terminate-instances",
                target=aws.fis.ExperimentTemplateActionTargetArgs(
                    key="Instances",
                    value="example-target",
                ),
            )],
            targets=[aws.fis.ExperimentTemplateTargetArgs(
                name="example-target",
                resource_type="aws:ec2:instance",
                selection_mode="COUNT(1)",
                resource_tags=[aws.fis.ExperimentTemplateTargetResourceTagArgs(
                    key="env",
                    value="example",
                )],
            )])
        ```

        ## Import

        Using `pulumi import`, import FIS Experiment Templates using the `id`. For example:

        ```sh
         $ pulumi import aws:fis/experimentTemplate:ExperimentTemplate template EXT123AbCdEfGhIjK
        ```

        :param str resource_name: The name of the resource.
        :param ExperimentTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ExperimentTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateActionArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 log_configuration: Optional[pulumi.Input[pulumi.InputType['ExperimentTemplateLogConfigurationArgs']]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 stop_conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateStopConditionArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateTargetArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ExperimentTemplateArgs.__new__(ExperimentTemplateArgs)

            if actions is None and not opts.urn:
                raise TypeError("Missing required property 'actions'")
            __props__.__dict__["actions"] = actions
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["log_configuration"] = log_configuration
            if role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'role_arn'")
            __props__.__dict__["role_arn"] = role_arn
            if stop_conditions is None and not opts.urn:
                raise TypeError("Missing required property 'stop_conditions'")
            __props__.__dict__["stop_conditions"] = stop_conditions
            __props__.__dict__["tags"] = tags
            __props__.__dict__["targets"] = targets
            __props__.__dict__["tags_all"] = None
        super(ExperimentTemplate, __self__).__init__(
            'aws:fis/experimentTemplate:ExperimentTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateActionArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            log_configuration: Optional[pulumi.Input[pulumi.InputType['ExperimentTemplateLogConfigurationArgs']]] = None,
            role_arn: Optional[pulumi.Input[str]] = None,
            stop_conditions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateStopConditionArgs']]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            targets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateTargetArgs']]]]] = None) -> 'ExperimentTemplate':
        """
        Get an existing ExperimentTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateActionArgs']]]] actions: Action to be performed during an experiment. See below.
        :param pulumi.Input[str] description: Description for the experiment template.
        :param pulumi.Input[pulumi.InputType['ExperimentTemplateLogConfigurationArgs']] log_configuration: The configuration for experiment logging. See below.
        :param pulumi.Input[str] role_arn: ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateStopConditionArgs']]]] stop_conditions: When an ongoing experiment should be stopped. See below.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ExperimentTemplateTargetArgs']]]] targets: Target of an action. See below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ExperimentTemplateState.__new__(_ExperimentTemplateState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["description"] = description
        __props__.__dict__["log_configuration"] = log_configuration
        __props__.__dict__["role_arn"] = role_arn
        __props__.__dict__["stop_conditions"] = stop_conditions
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["targets"] = targets
        return ExperimentTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Sequence['outputs.ExperimentTemplateAction']]:
        """
        Action to be performed during an experiment. See below.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description for the experiment template.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="logConfiguration")
    def log_configuration(self) -> pulumi.Output[Optional['outputs.ExperimentTemplateLogConfiguration']]:
        """
        The configuration for experiment logging. See below.
        """
        return pulumi.get(self, "log_configuration")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Output[str]:
        """
        ARN of an IAM role that grants the AWS FIS service permission to perform service actions on your behalf.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="stopConditions")
    def stop_conditions(self) -> pulumi.Output[Sequence['outputs.ExperimentTemplateStopCondition']]:
        """
        When an ongoing experiment should be stopped. See below.

        The following arguments are optional:
        """
        return pulumi.get(self, "stop_conditions")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def targets(self) -> pulumi.Output[Optional[Sequence['outputs.ExperimentTemplateTarget']]]:
        """
        Target of an action. See below.
        """
        return pulumi.get(self, "targets")

