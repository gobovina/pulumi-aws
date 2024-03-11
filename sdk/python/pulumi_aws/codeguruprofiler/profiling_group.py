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

__all__ = ['ProfilingGroupArgs', 'ProfilingGroup']

@pulumi.input_type
class ProfilingGroupArgs:
    def __init__(__self__, *,
                 agent_orchestration_config: Optional[pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs']] = None,
                 compute_platform: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ProfilingGroup resource.
        :param pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs'] agent_orchestration_config: Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
        :param pulumi.Input[str] compute_platform: Compute platform of the profiling group.
        :param pulumi.Input[str] name: Name of the profiling group.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if agent_orchestration_config is not None:
            pulumi.set(__self__, "agent_orchestration_config", agent_orchestration_config)
        if compute_platform is not None:
            pulumi.set(__self__, "compute_platform", compute_platform)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="agentOrchestrationConfig")
    def agent_orchestration_config(self) -> Optional[pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs']]:
        """
        Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
        """
        return pulumi.get(self, "agent_orchestration_config")

    @agent_orchestration_config.setter
    def agent_orchestration_config(self, value: Optional[pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs']]):
        pulumi.set(self, "agent_orchestration_config", value)

    @property
    @pulumi.getter(name="computePlatform")
    def compute_platform(self) -> Optional[pulumi.Input[str]]:
        """
        Compute platform of the profiling group.
        """
        return pulumi.get(self, "compute_platform")

    @compute_platform.setter
    def compute_platform(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compute_platform", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the profiling group.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ProfilingGroupState:
    def __init__(__self__, *,
                 agent_orchestration_config: Optional[pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs']] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 compute_platform: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ProfilingGroup resources.
        :param pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs'] agent_orchestration_config: Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
        :param pulumi.Input[str] arn: ARN of the profiling group.
        :param pulumi.Input[str] compute_platform: Compute platform of the profiling group.
        :param pulumi.Input[str] name: Name of the profiling group.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if agent_orchestration_config is not None:
            pulumi.set(__self__, "agent_orchestration_config", agent_orchestration_config)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if compute_platform is not None:
            pulumi.set(__self__, "compute_platform", compute_platform)
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
    @pulumi.getter(name="agentOrchestrationConfig")
    def agent_orchestration_config(self) -> Optional[pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs']]:
        """
        Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
        """
        return pulumi.get(self, "agent_orchestration_config")

    @agent_orchestration_config.setter
    def agent_orchestration_config(self, value: Optional[pulumi.Input['ProfilingGroupAgentOrchestrationConfigArgs']]):
        pulumi.set(self, "agent_orchestration_config", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the profiling group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="computePlatform")
    def compute_platform(self) -> Optional[pulumi.Input[str]]:
        """
        Compute platform of the profiling group.
        """
        return pulumi.get(self, "compute_platform")

    @compute_platform.setter
    def compute_platform(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compute_platform", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the profiling group.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class ProfilingGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 agent_orchestration_config: Optional[pulumi.Input[pulumi.InputType['ProfilingGroupAgentOrchestrationConfigArgs']]] = None,
                 compute_platform: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS CodeGuru Profiler Profiling Group.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codeguruprofiler.ProfilingGroup("example",
            name="example",
            compute_platform="Default",
            agent_orchestration_config=aws.codeguruprofiler.ProfilingGroupAgentOrchestrationConfigArgs(
                profiling_enabled=True,
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import CodeGuru Profiler Profiling Group using the `id`. For example:

        ```sh
        $ pulumi import aws:codeguruprofiler/profilingGroup:ProfilingGroup example profiling_group-name-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ProfilingGroupAgentOrchestrationConfigArgs']] agent_orchestration_config: Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
        :param pulumi.Input[str] compute_platform: Compute platform of the profiling group.
        :param pulumi.Input[str] name: Name of the profiling group.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProfilingGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS CodeGuru Profiler Profiling Group.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codeguruprofiler.ProfilingGroup("example",
            name="example",
            compute_platform="Default",
            agent_orchestration_config=aws.codeguruprofiler.ProfilingGroupAgentOrchestrationConfigArgs(
                profiling_enabled=True,
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import CodeGuru Profiler Profiling Group using the `id`. For example:

        ```sh
        $ pulumi import aws:codeguruprofiler/profilingGroup:ProfilingGroup example profiling_group-name-12345678
        ```

        :param str resource_name: The name of the resource.
        :param ProfilingGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProfilingGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 agent_orchestration_config: Optional[pulumi.Input[pulumi.InputType['ProfilingGroupAgentOrchestrationConfigArgs']]] = None,
                 compute_platform: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProfilingGroupArgs.__new__(ProfilingGroupArgs)

            __props__.__dict__["agent_orchestration_config"] = agent_orchestration_config
            __props__.__dict__["compute_platform"] = compute_platform
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(ProfilingGroup, __self__).__init__(
            'aws:codeguruprofiler/profilingGroup:ProfilingGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            agent_orchestration_config: Optional[pulumi.Input[pulumi.InputType['ProfilingGroupAgentOrchestrationConfigArgs']]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            compute_platform: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'ProfilingGroup':
        """
        Get an existing ProfilingGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ProfilingGroupAgentOrchestrationConfigArgs']] agent_orchestration_config: Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
        :param pulumi.Input[str] arn: ARN of the profiling group.
        :param pulumi.Input[str] compute_platform: Compute platform of the profiling group.
        :param pulumi.Input[str] name: Name of the profiling group.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProfilingGroupState.__new__(_ProfilingGroupState)

        __props__.__dict__["agent_orchestration_config"] = agent_orchestration_config
        __props__.__dict__["arn"] = arn
        __props__.__dict__["compute_platform"] = compute_platform
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return ProfilingGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="agentOrchestrationConfig")
    def agent_orchestration_config(self) -> pulumi.Output[Optional['outputs.ProfilingGroupAgentOrchestrationConfig']]:
        """
        Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
        """
        return pulumi.get(self, "agent_orchestration_config")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the profiling group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="computePlatform")
    def compute_platform(self) -> pulumi.Output[str]:
        """
        Compute platform of the profiling group.
        """
        return pulumi.get(self, "compute_platform")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the profiling group.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

